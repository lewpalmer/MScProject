package Betfair.API.Handler.Main;

public class BetfairAPICredentials {

	private String username;
	private String password;
	private String applicationKey;
	private String SessionID;
	private String certificateLocation;
	private String certificatePasscode;
	
	public void SetUsername(String username)
	{
		this.username = username;
	}
	
	public void SetPassword(String password)
	{
		this.password = password;
	}
	
	public void SetApplicationKey(String key)
	{
		this.applicationKey = key;
	}
	
	public void SetSessionID(String sessionID)
	{
		this.SessionID = sessionID;
	}
	
	public String GetUsername()
	{
		return this.username;
	}
	
	public String GetPassword()
	{
		return this.password;
	}
	
	public String GetApplicationKey()
	{
		return this.applicationKey;
	}
	
	public String GetSessionID()
	{
		return this.SessionID;
	}
	
	public void SetCertificateLocation(String location)
	{
		this.certificateLocation = location;
	}
	
	public String GetCertificateLocation()
	{
		return this.certificateLocation;
	}
	
	public void SetCertificatePasscode(String passcode)
	{
		this.certificatePasscode = passcode;
	}
	
	public String GetCertificatePasscode()
	{
		return this.certificatePasscode;
	}
	
}
