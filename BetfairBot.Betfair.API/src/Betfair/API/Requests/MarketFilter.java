package Betfair.API.Requests;

import java.util.Set;

import Betfair.API.Utilities.*;

public class MarketFilter extends BetfairRequest {
	protected String textQuery;
	protected Set<String> exchangeIds;
	protected Set<String> eventTypeIds;
	protected Set<String> eventIds;
	protected Set<String> competitionIds;
	protected Set<String> marketIds;
	protected Set<String> venues;
	protected boolean bspOnly;
	protected boolean turnInPlayEnabled;
	protected boolean inPlayOnly;
	protected Set<MarketBettingType> marketBettingTypes;
	protected Set<String> marketCountries;
	protected Set<String> marketTypeCodes;
	protected TimeRange marketStartTime;
	protected Set<OrderStatus> withOrders;
}
