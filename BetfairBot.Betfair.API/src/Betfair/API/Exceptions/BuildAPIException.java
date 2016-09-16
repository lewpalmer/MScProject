package Betfair.API.Exceptions;

public class BuildAPIException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String callThatFailed;
	private String message;
	
	public BuildAPIException(String callThatFailed, String message)
	{
		this.callThatFailed = callThatFailed;
		this.message = message;
	}
	
	public BuildAPIException(String message)
	{
		this("Not Found", message);
	}
	
	@Override
	public String getMessage()
	{
		return String.format("BuildAPI Error | Call: %s - %s", this.callThatFailed, this.message);
	}

}
