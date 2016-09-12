package Betfair.API.Calls;

import java.util.Date;
import java.util.List;

import Betfair.API.Requests.listEventTypesRequest;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.EventTypeResult;

public class listEventTypesCall extends APICall<List<EventTypeResult>> {

	public listEventTypesCall(Date to, Date from)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.MethodName = BetfairAPIMethodNames.LIST_EVENT_TYPES;
		this.method = APIMethod.GET;
		this.request = new listEventTypesRequest(to, from);

	}
}
