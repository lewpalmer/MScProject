package Betfair.API.Requests;

import java.util.Set;

import Betfair.API.Utilities.OrderBy;
import Betfair.API.Utilities.OrderProjection;
import Betfair.API.Utilities.SortDir;
import Betfair.API.Utilities.TimeRange;

public class listCurrentOrdersRequest extends BetfairRequest {
	private Set<String> betIds;
	private Set<String> marketIds;
	private OrderProjection orderProjection;
	private TimeRange placedDateRange;
	private OrderBy orderBy;
	private SortDir sortDir;
	private int fromRecord;
	private int recordCount;
	
	public listCurrentOrdersRequest(Set<String> betIds, Set<String> marketID, OrderProjection orderProj, TimeRange tRange, int from, int records)
	{
		this.betIds = betIds;
		this.marketIds = marketID;
		this.orderProjection = orderProj;
		this.placedDateRange = tRange;
		this.orderBy = OrderBy.BY_PLACE_TIME;
		this.sortDir = SortDir.LATEST_TO_EARLIEST;
		this.fromRecord = from;
		this.recordCount = records;
	}
}
