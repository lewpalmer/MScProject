package Betfair.API.Calls.Test;

import static org.junit.Assert.assertEquals;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;

import Betfair.API.Calls.listEventTypesCall;

public class listEventTypesCallTest extends BetfairAPICallTest {

	@Test
	public void testSuccessfulCall() throws Exception
	{
		Date todaysDate = new Date();
		Date tomorrowsDate = new Date(todaysDate.getYear(), todaysDate.getMonth(), todaysDate.getDate() + 1);
		listEventTypesCall testCall = new listEventTypesCall(this.loggedinCreds, tomorrowsDate, todaysDate);
		boolean successfulCall = testCall.call();
		assertEquals(successfulCall, true);
	}
}
