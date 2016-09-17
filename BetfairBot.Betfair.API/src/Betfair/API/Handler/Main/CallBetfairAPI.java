package Betfair.API.Handler.Main;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.net.ssl.HttpsURLConnection;

import Betfair.API.Exceptions.CallAPIException;
import Betfair.API.Utilities.ResponseCodes;

public class CallBetfairAPI {
	
	private String apiResponse;
	
	public CallBetfairAPI(HttpsURLConnection apiConnection) throws CallAPIException
	{
		BufferedReader in;
		StringBuffer response;
		try {
			apiConnection.connect();
			try{
				in = new BufferedReader(new InputStreamReader(apiConnection.getInputStream()));
			}
			catch(IOException e)
			{System.out.println(apiConnection.getResponseMessage());
				try {
					throw new CallAPIException(apiConnection.getResponseCode(), apiConnection.getRequestMethod(), "Error in getInputStream");
				} catch (CallAPIException e1) {
					throw new CallAPIException("Error getting request method and/or code");
				}
			}
		
	        String inputLine;
	        response = new StringBuffer();
	        try{
	        	while ((inputLine = in.readLine()) != null) {
		            response.append(inputLine);
	        	}
	        }
        	catch(IOException e)
			{
				try {
					throw new CallAPIException(apiConnection.getRequestMethod(), "Error in reading response");
				} catch (CallAPIException e1) {
					throw new CallAPIException("Error getting request method");
				}
			}
	        in.close();
	        if(response != null && apiConnection.getResponseCode() == ResponseCodes.OK)
	        	apiResponse = response.toString();
		}
        catch (IOException e) {
			throw new CallAPIException("Unknown error processing call API");
		}
	}
	
	public String GetResponse()
	{
		return this.apiResponse;
	}
}
