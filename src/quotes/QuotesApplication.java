package quotes;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;



public class QuotesApplication extends Application {

	@Override
	public synchronized Restlet createInboundRoot() {

       Router router = new Router(getContext());

       router.attach("/quote/", QuotesResource.class);
       router.attach("/quotes/{word}", QuoteResource.class);

       return router;
   }
}
