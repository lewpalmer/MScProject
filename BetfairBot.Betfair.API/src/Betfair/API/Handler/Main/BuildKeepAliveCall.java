package Betfair.API.Handler.Main;

import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

import Betfair.API.Exceptions.BuildAPIException;
import Betfair.API.Utilities.APIMethod;

public class BuildKeepAliveCall extends BuildBetfairAPICall {
	
	public BuildKeepAliveCall(BetfairAPICredentials bfCreds, String EndPoint, String MethodName, APIMethod method, Boolean GetOutput, BetfairAPICredentials bfCred) throws BuildAPIException {
		super(bfCreds, EndPoint, MethodName, method, GetOutput);
		try {
				apiURL = new URL(EndPoint+MethodName);
				apiConnection = (HttpsURLConnection)apiURL.openConnection();
				
				apiConnection.setDoInput(GetOutput);
				apiConnection.setDoOutput(GetOutput);
				
				apiConnection.setRequestMethod(method.getValue());
				
				apiConnection.setRequestProperty(APIHeader, bfCreds.GetApplicationKey());
				apiConnection.setRequestProperty(APIHeader2, "application/json");
				apiConnection.setRequestProperty(APIHeader3, bfCreds.GetSessionID());
				
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}
}
