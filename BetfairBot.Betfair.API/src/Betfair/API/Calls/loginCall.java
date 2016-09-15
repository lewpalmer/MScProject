package Betfair.API.Calls;

import Betfair.API.Requests.*;
import Betfair.API.Responses.*;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;

import java.io.IOException;
import java.io.OutputStreamWriter;

import com.google.gson.Gson;

import Betfair.API.Handler.Main.*;

public class loginCall extends APICall<LoginResponse> {

	private CreateSSLSocket sslSocket;
	private boolean loggedIn = false;
	
	public loginCall(BetfairAPICredentials bfCreds, LoginRequest request)
	{
		this.EndPoint = EndPoints.LogInAPI;
		this.GetOutput = true;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.LOGIN;
		this.request = request;
		this.sslSocket = new CreateSSLSocket(bfCreds.GetCertificateLocation(), bfCreds.GetCertificatePasscode());
		this.bfCreds = bfCreds;
		this.callResponse = new BetfairAPIResponse<LoginResponse>();
		this.response = new LoginResponse();
	}
	
	@Override
	public boolean call()
	{
		BuildBetfairAPICall apiReq = new BuildBetfairAPICall(bfCreds, EndPoint, MethodName, method, GetOutput);
		Gson parameters = new Gson();
		OutputStreamWriter wr = null;
		try {
			wr = new OutputStreamWriter(apiReq.GetAPIConnection().getOutputStream());
			wr.write(String.format("username=%s&password=%s",bfCreds.GetUsername(), bfCreds.GetPassword()));
			wr.flush();
			wr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		CallBetfairAPI apiCall = new CallBetfairAPI(apiReq.GetAPIConnection());
		this.response = new Gson().fromJson(apiCall.GetResponse(), this.response.getClass());
		boolean success = this.response.getloginStatus().equals("SUCCESS");
		if(success)
			this.bfCreds.SetSessionID(this.response.getSessionToken());
		this.loggedIn = success;
		return success;
	}
	
	public BetfairAPICredentials getLoggedInCredentials()
	{
		if(this.loggedIn)
			return this.bfCreds;
		return null;
	}
}
