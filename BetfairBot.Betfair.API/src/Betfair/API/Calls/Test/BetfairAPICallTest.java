package Betfair.API.Calls.Test;

import org.junit.BeforeClass;

import Betfair.API.Calls.loginCall;
import Betfair.API.Handler.Main.BetfairAPICredentials;
import Betfair.API.Requests.LoginRequest;

public class BetfairAPICallTest {

	protected static BetfairAPICredentials loggedinCreds;
	@BeforeClass
	public static void setUpLogIn()
	{
		BetfairAPICredentials testCredentials = loadBetfairCredentialsFile.loadUserCredentials();
		loginCall logInForTesting = new loginCall(testCredentials, new LoginRequest(testCredentials.GetUsername(), testCredentials.GetPassword()));
		logInForTesting.call();
		BetfairAPICallTest.loggedinCreds = logInForTesting.getLoggedInCredentials();
	}
}
