package Betfair.API.Responses;

import java.util.List;

import Betfair.API.Utilities.CurrentOrderSummary;

public class listCurrentOrdersResponse extends BetfairResponse {
	
	private List<CurrentOrderSummary> currentOrders;
	private boolean moreAvailable;

	
}
