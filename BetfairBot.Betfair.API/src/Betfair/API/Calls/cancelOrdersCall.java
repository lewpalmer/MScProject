package Betfair.API.Calls;

import java.util.List;

import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Requests.cancelOrdersRequest;
import Betfair.API.Responses.cancelOrdersResponse;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.CancelInstruction;
import Betfair.API.Utilities.EndPoints;

public class cancelOrdersCall extends APICall<cancelOrdersResponse> {

	public cancelOrdersCall(BetfairAPICredentials bfCreds, String mktId, List<CancelInstruction> instructions, String custRef)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.CANCEL_ORDERS;
		this.request = new cancelOrdersRequest(mktId, instructions, custRef);
	}
}
