package Betfair.API.Handler.Main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;

public class CallBetfairAPI {
	
	private String apiResponse;
	
	public CallBetfairAPI(HttpURLConnection apiConnection)
	{
		BufferedReader in;
		try {
			in = new BufferedReader(new InputStreamReader(apiConnection.getInputStream()));
		
	        String inputLine;
	        StringBuffer response = new StringBuffer();
	
	        while ((inputLine = in.readLine()) != null) {
	            response.append(inputLine);
        }
        in.close();
        apiResponse = response.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public String GetResponse()
	{
		return this.apiResponse;
	}
}
