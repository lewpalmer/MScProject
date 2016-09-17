package Betfair.API.Requests;

import java.text.SimpleDateFormat;
import java.util.Date;

import Betfair.API.Utilities.TimeRange;

public class listEventTypesRequest extends MarketFilter {

	public listEventTypesRequest(Date to, Date from)
	{
		this.marketStartTime = new TimeRange(to, from);
	}
	
	public listEventTypesRequest(Date to)
	{
		this.marketStartTime = new TimeRange(to);
	}
}
