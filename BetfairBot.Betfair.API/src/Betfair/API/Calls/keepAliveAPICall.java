package Betfair.API.Calls;


import com.google.gson.Gson;

import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Handler.Main.BuildBetfairAPICall;
import Betfair.API.Handler.Main.BuildKeepAliveCall;
import Betfair.API.Handler.Main.CallBetfairAPI;
import Betfair.API.Responses.BetfairAPIResponse;
import Betfair.API.Responses.keepAliveResponse;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;

public class keepAliveAPICall extends APICall<keepAliveResponse> {
	private BetfairAPICredentials bfCredentials;
	
	public keepAliveAPICall(BetfairAPICredentials bfCred)
	{
		this.EndPoint = EndPoints.KeepAliveAPI;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.KEEP_ALIVE;
		this.GetOutput = true;
		this.bfCredentials = bfCred;
	}
	
	@Override
	public boolean call()
	{
		BuildBetfairAPICall apiReq = new BuildKeepAliveCall(bfCredentials, EndPoint, MethodName, method, GetOutput, this.bfCredentials);
		CallBetfairAPI apiCall = new CallBetfairAPI(apiReq.GetAPIConnection());
		BetfairAPIResponse<keepAliveResponse> apiResponse = new Gson().fromJson(apiCall.GetResponse(), callResponse.getClass());
		this.response = (keepAliveResponse)apiResponse.retrieveData(response);
		return apiResponse.hasNoError();
	}
}
