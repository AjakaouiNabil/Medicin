package quotes;

import org.restlet.Component;
import org.restlet.data.Protocol;

public class QuotesServer {

	public static void main(String[] args) {
		
		try {
			// Create a new Component.
		    Component component = new Component();
	
		    // Add a new HTTP server listening on port 8182.
		    component.getServers().add(Protocol.HTTP, 8183);
	
		    // Attach the sample application.
		    component.getDefaultHost().attach("/quote", new QuotesApplication());

		    
			component.start();
		} 
	    catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

}
