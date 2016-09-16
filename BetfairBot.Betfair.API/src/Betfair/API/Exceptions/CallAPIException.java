package Betfair.API.Exceptions;

public class CallAPIException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int responseCode = -1;
	private String message;
	private String method;
	
	public CallAPIException(int rCode, String methodName, String message)
	{
		this.responseCode = rCode;
		this.method = methodName;
		this.message = message;
	}
	
	public CallAPIException(String methodName, String message)
	{
		this(-1, methodName, message);
	}
	
	public CallAPIException(String message)
	{
		this(-1, "Not Found", message);
	}
	
	@Override
	public String getMessage()
	{
		return String.format("CallAPI | Call: %s %s - %s", method, responseCode == -1 ? "" : responseCode, message);
	}

}
