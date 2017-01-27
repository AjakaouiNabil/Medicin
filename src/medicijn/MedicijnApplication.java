package medicijn;

import org.restlet.Application;
import org.restlet.Restlet;
import org.restlet.routing.Router;


public class MedicijnApplication extends Application{
	
	@Override
	public synchronized Restlet createInboundRoot() {

       Router router = new Router(getContext());

       router.attach("/medicijn/", MedicijnenResource.class);
       router.attach("/medicijnen/{word}", MedicijnResource.class);

       return router;
   }
	
}
