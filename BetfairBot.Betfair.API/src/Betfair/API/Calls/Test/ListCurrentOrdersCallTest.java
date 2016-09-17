package Betfair.API.Calls.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Betfair.API.Calls.listCurrentOrdersCall;

public class ListCurrentOrdersCallTest extends BetfairAPICallTest {

	@Test
	public void testSuccessfulCall() throws Exception
	{
		listCurrentOrdersCall testCall = new listCurrentOrdersCall(this.loggedinCreds, null, null, null, null, 0, 1);
		boolean successfulCall = testCall.call();
		assertEquals(successfulCall, true);
	}
}
