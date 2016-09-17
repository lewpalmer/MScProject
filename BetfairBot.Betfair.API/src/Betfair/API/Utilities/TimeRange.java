package Betfair.API.Utilities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeRange {
	private String from;
	private String to;
	
	public TimeRange(Date to, Date from)
	{
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm'Z'");
		this.to = dateFormat.format(to);
		this.from = dateFormat.format(from);
	}
	
	public TimeRange(Date to)
	{
		this(to, new Date());
	}

}
