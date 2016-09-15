package Betfair.API.Calls.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import Betfair.API.Calls.loginCall;
import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Requests.LoginRequest;

public class loginCallTest {

	@Test
	/**
	 * Unit test for logging in.
	 */
	public void testSuccessfulLogIn()
	{
		BetfairAPICredentials testBFCreds = loadBetfairCredentialsFile.loadUserCredentials();
		loginCall testCall = new loginCall(testBFCreds, new LoginRequest(testBFCreds.GetUsername(), testBFCreds.GetPassword()));
		boolean successfulLogin = testCall.call();
		
		assertEquals(successfulLogin, true);
	}
}
