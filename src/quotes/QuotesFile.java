package quotes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;




public class QuotesFile {
	private static final String fileLocation = "C:\\Users/nab/Desktop/Oscar.txt";
	
	//deze methode geeft je alle quotes terug die het woordje(key) 
	//bevatten maar echt het woordje en niet wat niet het geval was toen ik gwn contains methode heb gebruikt
	public static ArrayList<String> getQuotes(String key) {
		
		ArrayList<String> result = new ArrayList<>();
		for (String quote : getAllQuotes()){
			String[] ListOfWords = quote.split(" ");
			for(String word : ListOfWords){
				if (word.equals(key) && !(result.contains(quote))) {
					result.add(quote);
				}
			}
		}
		return result;
	}
	
	
	// deze methode haalt alle quotes op van het Quotes_Oscar.txt documenten.
	public static String[] getAllQuotes(){
		StringBuilder sBuilder = new StringBuilder();
		BufferedReader buffer = null;
		try {
			buffer = new BufferedReader(new FileReader(fileLocation));
		    String currLine = buffer.readLine();

		    while (currLine != null) {
		    	if (currLine.length() == 0) {
		    		sBuilder.append("//");
		    	}
		    	else{
		    		sBuilder.append(currLine);
		    	}
		        
		        currLine = buffer.readLine();
		    }
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
		System.out.println(sBuilder.toString());
		return sBuilder.toString().split("//");	
	}
	
	
	
}
