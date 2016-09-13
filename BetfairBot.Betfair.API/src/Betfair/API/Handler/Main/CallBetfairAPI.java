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
			apiConnection.connect();
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
			try {
				System.out.print(apiConnection.getResponseCode());
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
			e.printStackTrace();
		}
	}
	
	public String GetResponse()
	{
		return this.apiResponse;
	}
}
