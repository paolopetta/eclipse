
import java.io.IOException;
import java.util.StringTokenizer;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Check
 */
@WebServlet("/Check")
public class Check extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String error = "";

		String name = request.getParameter("name");
		String surname = request.getParameter("surname");

		if (name == null || name.equals("")) {
			error += "Insert name<br>";
		} else {
			request.setAttribute("name", replaceIfMissing(name, ""));
		}
		if (surname == null || surname.equals("")) {
			error += "Insert surname<br>";
		} else {
			request.setAttribute("surname", replaceIfMissing(surname, ""));
		}

		request.setAttribute("error", error);

		RequestDispatcher dispatcher = getServletContext().getRequestDispatcher("/checkForm.jsp");
		dispatcher.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

	private String replaceIfMissing(String orig, String replacement) {
		if ((orig == null) || (orig.trim().equals(""))) {
			return (replacement);
		} else {
			return (orig);
		}
	}

	@SuppressWarnings("unused")
	private String replaceIfMissingOrDefault(String orig, String replacement) {
		if ((orig == null) || (orig.trim().equals("")) || (orig.equals("default"))) {
			return (replacement);
		} else {
			return (orig + ", ");
		}
	}

	@SuppressWarnings("unused")
	private String makeList(String listItems) {
		StringTokenizer tokenizer = new StringTokenizer(listItems, ", ");
		String list = "<UL>\n";
		while (tokenizer.hasMoreTokens()) {
			list = list + "  <LI>" + tokenizer.nextToken() + "\n";
		}
		list = list + "</UL>";
		return (list);
	}

}
