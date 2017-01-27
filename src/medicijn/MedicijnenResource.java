package medicijn;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.json.JSONObject;
import org.restlet.resource.Get;
import org.restlet.resource.Post;
import org.restlet.resource.ServerResource;

public class MedicijnenResource extends ServerResource{
	private static final String fileLocation = "C:\\Users/nab/Desktop/Medicijnen.txt";
	@Get("txt")
	public String getAllMeds() {
		return MedicijnFile.getAllMedicijnen().toString();
	}
	
	@Post("txt")
	public void newRegistration(String json) throws IOException {
		
		
		
		JSONObject newRegistration = new JSONObject(json);
		newRegistration.getString("Naam");
		newRegistration.getString("Vervaldatum");
		newRegistration.getString("Producent");
		newRegistration.getString("Hoeveelheid");
				
		File file=new File(fileLocation);
		FileWriter fw=new FileWriter(file,true);
		BufferedWriter bf=new BufferedWriter(fw);
		PrintWriter pr=new PrintWriter(bf);
		pr.print(newRegistration.toString());
		pr.close();	
	}

}
