package Betfair.API.Calls;

import java.util.List;

import Betfair.API.Requests.MarketFilterRequest;
import Betfair.API.Requests.listMarketCatalogueRequest;
import Betfair.API.Utilities.APIMethod;
import Betfair.API.Utilities.BetfairAPIMethodNames;
import Betfair.API.Utilities.EndPoints;
import Betfair.API.Utilities.MarketCatalogue;

public class listMarketCatalogueCall extends APICall<List<MarketCatalogue>> {
	
	public listMarketCatalogueCall(String eventID)
	{
		this.EndPoint = EndPoints.BettingAPI;
		this.GetOutput = true;
		this.MethodName = BetfairAPIMethodNames.LIST_MARKET_CATALOGUE;
		this.method = APIMethod.GET;
		this.request = new MarketFilterRequest(new listMarketCatalogueRequest(eventID));
	}

}
