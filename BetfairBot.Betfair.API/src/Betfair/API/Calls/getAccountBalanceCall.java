package Betfair.API.Calls;

import Betfair.API.Requests.getAccountFundsRequest;
import Betfair.API.Responses.getAccountFundsResponse;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;


public class getAccountBalanceCall extends APICall<getAccountFundsResponse> {

	public getAccountBalanceCall()
	{
		this.EndPoint = EndPoints.AccountsAPI;
		this.GetOutput = true;
		this.method = APIMethod.POST;
		this.MethodName = BetfairAPIMethodNames.GET_ACCOUNT_BALANCE;
		this.request = new getAccountFundsRequest();
		this.response = new getAccountFundsResponse();
	}
}
