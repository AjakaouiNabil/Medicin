package quotes;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class QuoteResource extends ServerResource{
	@Get("txt")
	public String getQuotes(){
		String word = getAttribute("word");
		StringBuilder sb = new StringBuilder();
		for (String q : QuotesFile.getQuotes(word)){
			sb.append(q + "//");
		}
		return sb.toString();
	}
}
