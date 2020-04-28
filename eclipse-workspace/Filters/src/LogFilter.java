
import javax.servlet.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

public class LogFilter implements Filter {
	public void init(FilterConfig config) throws ServletException {
		// Get init parameter
		String testParam = config.getInitParameter("test-param");

		// Print the init parameter
		System.out.println("Test Param: " + testParam);
	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		boolean single = false;
		
		if(single)
			doFilterIn(request, response, chain);
		else 
			doFilterInOut(request, response, chain);
	}
	
	
	public void doFilterIn(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String name = request.getServerName();
		out.println("Name " + name + ", Time " + new Date().toString());

		// Pass request back down the filter chain
		chain.doFilter(request, response);
	}

	public void destroy() {
		// Called before the Filter instance is removed from service by the web container
	}
		
	public void doFilterInOut(ServletRequest request, ServletResponse response, FilterChain chain)
	        throws IOException, ServletException {
	 
	    doBeforeProcessing(request, response);
	 	 
	    Throwable problem = null;
	    try {
	        chain.doFilter(request, response);
	    } catch (Throwable t) {
	        problem = t;
	    }
	 
	    doAfterProcessing(request, response);
	 
	    if (problem != null) {
	        if (problem instanceof ServletException) {
	            throw (ServletException) problem;
	        }
	        if (problem instanceof IOException) {
	            throw (IOException) problem;
	        }
	        sendProcessingError(problem, response);
	    }
	}
	
	private void doBeforeProcessing(ServletRequest request, ServletResponse response) throws IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("Before " + request.getServerName() + ", Time " + new Date().toString());
	}
	
	private void doAfterProcessing(ServletRequest request, ServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("After " + request.getServerName() + ", Time " + new Date().toString());
	}	
	
	private void sendProcessingError(Throwable problem, ServletResponse response) throws IOException {
		//...
	}	
	
}

