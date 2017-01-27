package medicijn;

import org.restlet.resource.Get;
import org.restlet.resource.ServerResource;


public class MedicijnResource extends ServerResource {
	@Get("txt")
	public String getMed(){
		String word = getAttribute("word");
		return MedicijnFile.getMedicijn(word).toString();
	}
}
