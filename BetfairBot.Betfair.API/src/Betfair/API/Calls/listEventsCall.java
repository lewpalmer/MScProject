package Betfair.API.Calls;

import java.util.Date;
import java.util.List;

import Betfair.API.Requests.listEventsRequest;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.EventResult;

public class listEventsCall extends APICall<List<EventResult>> {

	public listEventsCall(String eventIDs, Date to, Date from)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.method = APIMethod.GET;
		this.MethodName = BetfairAPIMethodNames.LIST_EVENTS;
		this.request = new listEventsRequest(to, from, eventIDs);
	}
	
	public listEventsCall(String eventIDs, Date to)
	{
		this(eventIDs, to, new Date());
	}
}
