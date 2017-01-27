package medicijn;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;

//import jdk.nashorn.internal.parser.JSONParser;
 
public class MedicijnFile {
	private static final String fileLocation = "C:\\Users/nab/Desktop/Medicijnen.txt";
	static JSONParser parser = new JSONParser();
	
	public static JSONObject getMedicijn(String medicijn) {
		    JSONObject result = new JSONObject();
		    for (JSONObject med : getAllMedicijnen()) {
		    	if (med.get("Naam") == medicijn) {
					result = getAllMedicijnen();
				}
			}
			
		}
	
	
	public static JSONObject getAllMedicijnen(){
		JSONObject jsonObj ;
		BufferedReader buffer = null;
		try {
		    
		    Object obj = parser.parse(new FileReader(fileLocation));
            jsonObj = (JSONObject) obj;
		}
		catch (Exception e){
		    System.out.println(e.getMessage());
	    }
		finally {
			try {
				buffer.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println((String)jsonObj.get("Naam"));
		return jsonObj;	
	}
}
