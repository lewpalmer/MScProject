package Betfair.API.Calls;

import com.google.gson.Gson;

import Betfair.API.Handler.Main.*;
import Betfair.API.Requests.BetfairRequest;
import Betfair.API.Responses.BetfairAPIResponse;
import Betfair.API.Responses.BetfairResponse;
import Betfair.API.Utilities.APIMethod;

public abstract class APICall<T> {
	protected String EndPoint;
	protected String MethodName; 
	protected APIMethod method;
	protected boolean GetOutput;
	protected BetfairRequest request;
	protected T response;
	protected BetfairAPIResponse<T> callResponse;
	protected BetfairAPICredentials bfCreds;
	
	public boolean call()
	{
		BuildBetfairAPICall apiReq = new BuildBetfairAPICall(bfCreds, EndPoint, MethodName, method, GetOutput);
		apiReq.AddParameters(request);
		CallBetfairAPI apiCall = new CallBetfairAPI(apiReq.GetAPIConnection());
		BetfairAPIResponse<T> apiResponse = new Gson().fromJson(apiCall.GetResponse(), callResponse.getClass());
		this.response = (T)apiResponse.retrieveData(response);
		return apiResponse.checkForError();
	}
	
	public T getData()
	{
		return this.response;
	}
}
