package Betfair.API.Calls.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Betfair.API.Calls.keepAliveAPICall;
import Betfair.API.Handler.Main.BetfairAPICredentials;

public class keepAliveTest extends BetfairAPICallTest {

	@Test
	public void testSuccessfulCall()
	{
		keepAliveAPICall testCall = new keepAliveAPICall(this.loggedinCreds);
		boolean successfulCall = testCall.call();
		assertEquals(successfulCall, true);
	}
}
