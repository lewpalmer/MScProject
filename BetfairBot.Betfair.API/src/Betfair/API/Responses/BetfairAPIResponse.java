package Betfair.API.Responses;

import com.google.gson.Gson;

public class BetfairAPIResponse<T> {
	private String jsonRpc;
    private String result;
    private Boolean hasError;
    private T usedClass;
    
    public T retrieveData(T sentClass)
    {
    	this.usedClass = sentClass;
    	if(result != null)
    		return (T) new Gson().fromJson(result, usedClass.getClass());
    	else
    		return null;
    }
    
    public boolean hasNoError()
    {
    	return !hasError;
    }
    
    public String getJsonRPC()
    {
    	return this.jsonRpc;
    }
}
