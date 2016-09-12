package Betfair.API.Requests;

import java.util.ArrayList;
import java.util.List;

import Betfair.API.Utilities.OrderProjection;
import Betfair.API.Utilities.PriceProjection;

public class listMarketBookRequest extends BetfairRequest {

	private List<String> marketIds;
	private PriceProjection priceProjection;
	private OrderProjection orderProjection;
	private String currencyCode;
	private String locale;
	
	public listMarketBookRequest(String marketID, PriceProjection pProj, OrderProjection oProj, String currency, String locale)
	{
		List<String> mIds = new ArrayList<String>();
		mIds.add(marketID);
		this.marketIds = mIds;
		this.priceProjection = pProj;
		this.orderProjection = oProj;
		this.currencyCode = currency;
		this.locale = locale;
	}
}
