package Betfair.API.Requests;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import Betfair.API.Utilities.TimeRange;

public class listEventsRequest extends MarketFilter {
	
	public listEventsRequest(Date to, Date from, String eventClassId)
	{
		Set<String> evCIds = new HashSet<String>();
		evCIds.add(eventClassId);
		this.eventTypeIds = evCIds;
		this.marketStartTime = new TimeRange(to, from);
	}
	
	public listEventsRequest(Date to, String eventClassId)
	{
		this(to, new Date(), eventClassId);
	}

}
