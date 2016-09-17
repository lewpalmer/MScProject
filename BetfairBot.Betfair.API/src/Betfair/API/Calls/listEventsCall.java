package Betfair.API.Calls;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Requests.MarketFilterRequest;
import Betfair.API.Requests.listEventsRequest;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.EventResult;

public class listEventsCall extends APICall<List<EventResult>> {

	public listEventsCall(BetfairAPICredentials bfCreds, String eventIDs, Date to, Date from)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.LIST_EVENTS;
		this.request = new MarketFilterRequest(new listEventsRequest(to, from, eventIDs));
		this.response = new ArrayList<EventResult>();
		this.bfCreds = bfCreds;
	}
	
	public listEventsCall(BetfairAPICredentials bfCreds, String eventIDs, Date to)
	{
		this(bfCreds, eventIDs, to, new Date());
	}
}
