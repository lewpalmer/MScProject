package Betfair.API.Requests;

public class MarketFilterRequest extends BetfairRequest {

	private MarketFilter filter;
	
	public MarketFilterRequest(MarketFilter reqFilter)
	{
		this.filter = reqFilter;
	}
}
