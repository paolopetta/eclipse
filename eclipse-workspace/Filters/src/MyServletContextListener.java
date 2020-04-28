import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class MyServletContextListener implements ServletContextListener {

    public MyServletContextListener() {
    }

    public void contextInitialized(ServletContextEvent event)  { 
    	// Initialize database connection
    	// Store it as a context attribute
    	// Use a Dog object to illustrate:
    	ServletContext sc = event.getServletContext();
    	String dogBreed = sc.getInitParameter("breed");
    	Dog d = new Dog(dogBreed);
    	sc.setAttribute("dog", d);
    	
    	System.out.println("Init: "+event.getServletContext().getServerInfo());
    }
    
    public void contextDestroyed(ServletContextEvent event)  { 
    	// Close the database connection
    	
    	System.out.println("Shutdown: "+event.getServletContext().getServerInfo());
    }    
	
}
