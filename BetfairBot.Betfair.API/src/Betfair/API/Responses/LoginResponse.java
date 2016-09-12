package Betfair.API.Responses;

/**
 * Holder class for Login Response to be deserialised from API response.
 * @author lewispalmer
 *
 */
public class LoginResponse extends BetfairResponse {
	private String sessionToken;
	private String loginStatus;
	
	public String getSessionToken()
	{
		return this.sessionToken;
	}
	
	public String getloginStatus()
	{
		return this.loginStatus;
	}
}
