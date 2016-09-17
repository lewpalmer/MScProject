package Betfair.API.Calls.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Betfair.API.Calls.listEventsCall;

public class listEventCallsTest extends BetfairAPICallTest {

	@Test
	public void testSuccessfulCall() throws Exception
	{
		listEventsCall testCall = new listEventsCall(this.loggedinCreds,null, null, null);
		boolean successfulCall = testCall.call();
		assertEquals(successfulCall, true);
	}
}
