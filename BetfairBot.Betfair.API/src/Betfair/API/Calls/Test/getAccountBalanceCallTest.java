package Betfair.API.Calls.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import Betfair.API.Calls.getAccountBalanceCall;

public class getAccountBalanceCallTest extends BetfairAPICallTest {

	@Test
	public void testSuccessfulCall() throws Exception
	{
		getAccountBalanceCall testCall = new getAccountBalanceCall(this.loggedinCreds);
		boolean successfulCall = testCall.call();
		assertEquals(successfulCall, true);
	}
}
