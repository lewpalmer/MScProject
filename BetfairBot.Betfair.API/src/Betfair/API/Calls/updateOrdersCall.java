package Betfair.API.Calls;

import java.util.List;

import Betfair.API.Requests.updateOrdersRequest;
import Betfair.API.Responses.updateOrdersResponse;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.UpdateInstruction;

public class updateOrdersCall extends APICall<updateOrdersResponse> {

	public updateOrdersCall(String mktId, List<UpdateInstruction> instructions, String custref)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.UPDATE_ORDERS;
		this.request = new updateOrdersRequest(mktId, instructions, custref);
	}
}
