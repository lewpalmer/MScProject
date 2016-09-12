package Betfair.API.Handler.Main;

import java.net.HttpURLConnection;
import java.net.URL;

import Betfair.API.Utilities.APIMethod;

public class BuildKeepAliveCall extends BuildBetfairAPICall {
	
	public BuildKeepAliveCall(String EndPoint, String MethodName, APIMethod method, Boolean GetOutput, BetfairAPICredentials bfCred) {
		super(MethodName, MethodName, method, GetOutput);
		try {
				apiURL = new URL(EndPoint+MethodName);
				apiConnection = (HttpURLConnection)apiURL.openConnection();
				
				apiConnection.setDoInput(GetOutput);
				apiConnection.setDoOutput(GetOutput);
				
				apiConnection.setRequestMethod(method.getValue());
				
				apiConnection.setRequestProperty(APIHeader, "application/json");
				apiConnection.setRequestProperty("X-Authentication", bfCred.GetSessionID());
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
