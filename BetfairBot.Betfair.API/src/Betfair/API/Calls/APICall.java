package Betfair.API.Calls;

import com.google.gson.Gson;

import Betfair.API.Handler.Main.*;
import Betfair.API.Requests.BetfairRequest;
import Betfair.API.Requests.MarketFilterRequest;
import Betfair.API.Utilities.APIMethod;

public abstract class APICall<T> {
	protected String EndPoint;
	protected String MethodName; 
	protected APIMethod method;
	protected boolean GetOutput;
	protected BetfairRequest request;
	protected T response;
	protected BetfairAPICredentials bfCreds;
	
	public boolean call() throws Exception
	{
		BuildBetfairAPICall apiReq = new BuildBetfairAPICall(bfCreds, EndPoint, MethodName, method, GetOutput);
		apiReq.AddParameters(request);
		CallBetfairAPI apiCall = new CallBetfairAPI(apiReq.GetAPIConnection());
		this.response = (T) new Gson().fromJson(apiCall.GetResponse(), response.getClass());
		return this.response != null;
	}
	
	public T getData()
	{
		return this.response;
	}
}
