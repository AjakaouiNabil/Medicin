package quotes;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;



public class QuotesResource extends ServerResource {
	
	@Get("txt")
	public String getQuotes() {
		StringBuilder sb = new StringBuilder();
		for (String q : QuotesFile.getQuotes("")){
			sb.append(q + "//");
		}
		return sb.toString();
	}
}
