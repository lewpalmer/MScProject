package Betfair.API.Calls;

import java.util.Set;

import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Requests.listCurrentOrdersRequest;
import Betfair.API.Responses.*;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.OrderProjection;
import Betfair.API.Utilities.TimeRange;

public class listCurrentOrdersCall extends APICall<listCurrentOrdersResponse> {

	public listCurrentOrdersCall(BetfairAPICredentials bfCreds, Set<String> betIds, Set<String> marketID, OrderProjection orderProj, TimeRange tRange, int from, int records)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.method = APIMethod.GET;
		this.MethodName = BetfairAPIMethodNames.LIST_CURRENT_ORDERS;
		this.request = new listCurrentOrdersRequest(betIds, marketID, orderProj, tRange, from, records);
		this.bfCreds = bfCreds;
		this.response = new listCurrentOrdersResponse();
	}
}
