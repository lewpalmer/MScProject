package Betfair.API.Calls;

import java.util.List;

import Betfair.API.Requests.listMarketBookRequest;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.MarketBook;
import Betfair.API.Utilities.OrderProjection;
import Betfair.API.Utilities.PriceProjection;

public class listMarketBookCall extends APICall<List<MarketBook>> {

	public listMarketBookCall(String marketID, PriceProjection pProj, OrderProjection oProj, String currency, String locale)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.method = APIMethod.GET;
		this.MethodName = BetfairAPIMethodNames.LIST_MARKET_BOOK;
		this.request = new listMarketBookRequest(marketID, pProj, oProj, currency, locale);
	}
}
