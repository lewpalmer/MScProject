package Betfair.API.Requests;

/**
 * Holder class for logging into the API to be converted to JSON
 * @author lewispalmer
 *
 */
public class LoginRequest extends BetfairRequest {
	private String username;
	private String password;
	
	public LoginRequest(String username, String password)
	{
		this.username = username;
		this.password = password;
	}

}
