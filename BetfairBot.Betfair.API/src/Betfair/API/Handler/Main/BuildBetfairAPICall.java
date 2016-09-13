package Betfair.API.Handler.Main;

import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.HttpURLConnection;
import java.net.URL;

import Betfair.API.Requests.BetfairRequest;
import Betfair.API.Utilities.APIMethod;

import com.google.gson.Gson;



/**
 * Class to handle all API calls.
 * @author lewispalmer
 *
 */
public class BuildBetfairAPICall {
	
	protected URL apiURL;
	protected HttpURLConnection apiConnection;
	protected final String APIHeader = "X-Application";
	protected final String APIHeader2 = "Accept";
	protected final String APIHeader3 = "X-Authentication";

	/**
	 * Constructor to build the request for the Betfair API Call. Builds a HTTPConnection.
	 * @param EndPoint
	 * @param MethodName
	 * @param method
	 * @param GetOutput
	 * @param requestHeaders
	 */
	public BuildBetfairAPICall(BetfairAPICredentials bfCredentials, String EndPoint, String MethodName, APIMethod method, Boolean GetOutput){
		
		try {
			apiURL = new URL(EndPoint+MethodName);
			apiConnection = (HttpURLConnection)apiURL.openConnection();
			apiConnection.setRequestMethod(method.getValue());
			apiConnection.setConnectTimeout(5000);
			apiConnection.setReadTimeout(5000);
			apiConnection.setDoInput(GetOutput);
			apiConnection.setDoOutput(GetOutput);
			
			apiConnection.setRequestMethod(method.getValue());
			
			apiConnection.setRequestProperty(APIHeader, bfCredentials.GetApplicationKey());
			apiConnection.setRequestProperty(APIHeader2, "application/json");
			apiConnection.setRequestProperty(APIHeader3, bfCredentials.GetSessionID());
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	/**
	 * Adds request parameters from the Map to the JSON object to be sent.
	 * @param requestParameters Map<String, String> or required parameters.
	 */
	public void AddParameters(BetfairRequest request)
	{
		Gson parameters = new Gson();
		OutputStreamWriter wr;
		try {
			wr = new OutputStreamWriter(apiConnection.getOutputStream());
			wr.write(parameters.toJson(request));
			wr.flush();
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public HttpURLConnection GetAPIConnection()
	{
		return this.apiConnection;
	}
}
