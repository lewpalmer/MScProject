package Betfair.API.Calls;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Requests.MarketFilterRequest;
import Betfair.API.Requests.listEventTypesRequest;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.EventTypeResult;

public class listEventTypesCall extends APICall<List<EventTypeResult>> {

	public listEventTypesCall(BetfairAPICredentials bfCreds, Date to, Date from)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.MethodName = BetfairAPIMethodNames.LIST_EVENT_TYPES;
		this.method = APIMethod.POST;
		this.request = new MarketFilterRequest(new listEventTypesRequest(to, from));
		this.bfCreds = bfCreds;
		this.response = new ArrayList<EventTypeResult>();
	}
	
	public listEventTypesCall(BetfairAPICredentials bfCreds, Date to)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.MethodName = BetfairAPIMethodNames.LIST_EVENT_TYPES;
		this.method = APIMethod.POST;
		this.request = new MarketFilterRequest(new listEventTypesRequest(to));
		this.bfCreds = bfCreds;
		this.response = new ArrayList<EventTypeResult>();
	}
}
