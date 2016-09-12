package Betfair.API.Utilities;


public enum APIMethod {
	GET("GET"),
	POST("POST");
	
	private final String method;
    APIMethod(String method) { this.method = method; }
    public String getValue() { return method; }
}