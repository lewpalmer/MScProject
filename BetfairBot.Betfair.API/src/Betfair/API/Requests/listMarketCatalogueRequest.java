package Betfair.API.Requests;

import java.util.HashSet;
import java.util.Set;

public class listMarketCatalogueRequest extends MarketFilter {

	public listMarketCatalogueRequest(String eventId)
	{
		Set<String> evIds = new HashSet<String>();
		evIds.add(eventId);
		this.eventIds = evIds;
	}
}
