
import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/PrimeNumberServlet")
public class PrimeNumberServlet extends HttpServlet {

	private ArrayList<PrimeList> primeListCollection = new ArrayList<PrimeList>();
	private int maxPrimeLists = 30;

	public static int getIntParameter(HttpServletRequest request, String paramName, int defaultValue) {
		String paramString = request.getParameter(paramName);
		int paramValue;
		try {
			paramValue = Integer.parseInt(paramString);
		} catch (NumberFormatException nfe) { // null or bad format
			paramValue = defaultValue;
		}
		return (paramValue);
	}

	
	private static final long serialVersionUID = 1L;
	
	public PrimeNumberServlet() {
		super();
	}
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int numPrimes = getIntParameter(request, "numPrimes", 50);
		int numDigits = getIntParameter(request, "numDigits", 120);
		PrimeList primeList = findPrimeList(primeListCollection, numPrimes, numDigits);

		if (primeList == null) {
			primeList = new PrimeList(numPrimes, numDigits, true);
			synchronized (primeListCollection) {
				if (primeListCollection.size() >= maxPrimeLists)
					primeListCollection.remove(0);
				primeListCollection.add(primeList);
			}
		}
		List<BigInteger> currentPrimes = primeList.getPrimes();
		int numCurrentPrimes = currentPrimes.size();
		int numPrimesRemaining = (numPrimes - numCurrentPrimes);
		boolean isLastResult = (numPrimesRemaining == 0);
		if (!isLastResult) {
			response.setIntHeader("Refresh", 1);
		}

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String title = "Some " + numDigits + "-Digit Prime Numbers";
		out.println("<html><body>" + 
					"<h2>" + title + "</H2>" + 
				    "<h3>Primes found with " + numDigits + " or more digits: " + numCurrentPrimes + "</h3>");
		if (isLastResult)
			out.println("<b>Done searching</b>");
		else
			out.println("<b>Still looking for " + numPrimesRemaining + " more...</b>");
		
		out.println("<ol>");
		for (int i = 0; i < numCurrentPrimes; i++) {
			out.println("<li>" + currentPrimes.get(i) + "</li>");
		}
		out.println("</ol>");
		out.println("</body></htmlL>");

	}

	private PrimeList findPrimeList(ArrayList<PrimeList> primeListCollection, int numPrimes, int numDigits) {
		synchronized (primeListCollection) {
			for (int i = 0; i < primeListCollection.size(); i++) {
				PrimeList primes = (PrimeList) primeListCollection.get(i);
				if ((numPrimes == primes.numPrimes()) && (numDigits == primes.numDigits()))
					return (primes);
			}
			return (null);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
