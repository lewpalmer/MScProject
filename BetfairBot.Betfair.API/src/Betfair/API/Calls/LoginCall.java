package Betfair.API.Calls;

import Betfair.API.Requests.*;
import Betfair.API.Responses.*;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Handler.Main.*;

public class LoginCall extends APICall<LoginResponse> {

	private CreateSSLSocket sslSocket;
	
	public LoginCall(LoginRequest request, String filepath, String password)
	{
		this.EndPoint = EndPoints.LogInAPI;
		this.GetOutput = true;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.LOGIN;
		this.request = request;
		this.sslSocket = new CreateSSLSocket(filepath, password);
	}
}
