package Betfair.API.Calls;

import java.util.List;

import Betfair.API.Requests.placeOrdersRequest;
import Betfair.API.Responses.placeOrdersResponse;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.MarketVersion;
import Betfair.API.Utilities.PlaceInstruction;

public class placeOrdersCall extends APICall<placeOrdersResponse> {
	
	public placeOrdersCall(String marketId, List<PlaceInstruction> instructions, String custRef, MarketVersion mktVer, String cusStratRef)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.PLACE_ORDERS;
		this.request = new placeOrdersRequest(marketId, instructions, custRef, mktVer, cusStratRef);
	}

}
