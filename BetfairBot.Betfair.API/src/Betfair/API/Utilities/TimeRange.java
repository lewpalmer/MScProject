package Betfair.API.Utilities;

import java.time.LocalDateTime;
import java.util.Date;

public class TimeRange {
	private Date from;
	private Date to;
	
	public TimeRange(Date to, Date from)
	{
		this.to = to;
		this.from = from;
	}
	
	public TimeRange(Date to)
	{
		this(to, new Date());
	}

}
