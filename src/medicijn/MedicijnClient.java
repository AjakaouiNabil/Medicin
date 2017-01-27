package medicijn;

import org.json.JSONObject;
import org.restlet.resource.ClientResource;

public class MedicijnClient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
        	ClientResource resource = new ClientResource("http://127.0.0.1:8184/medicijn/medicijn/");
        	// Post a new record
        	
        	JSONObject json = new JSONObject();
        	json.put("Naam", "dafalgan");
    		json.put("Vervaldatum", "01-01-2018");
    		json.put("Producent", "pro1");
    		json.put("Hoeveelheid", "10");

    		resource.post(json.toString());
    		System.out.println(resource.getResponseEntity().getText());
    	
    		
    		
    		JSONObject json2 = new JSONObject();
        	json2.put("Naam", "dafalgan2");
    		json2.put("Vervaldatum", "01-01-2018");
    		json2.put("Producent", "pro2");
    		json2.put("Hoeveelheid", "100");

    		resource.post(json2.toString());
    		System.out.println(resource.getResponseEntity().getText());
    		
    		
    		ClientResource resource2 = new ClientResource("http://127.0.0.1:8184/medicijn/medicijn/");
			System.out.println(resource2.get());
        	
        }
        catch (Exception e) {
            System.out.println("In main : " + e.getMessage());
        }
		
		

	}

}
