package Betfair.API.Responses;

import Betfair.API.Utilities.keepAliveErrorResponses;
import Betfair.API.Utilities.keepAliveStatus;

public class keepAliveResponse {
	private String token;
	private String product;
	private keepAliveStatus status;
	private keepAliveErrorResponses error;
	
	public keepAliveStatus getStatus() {
		return status;
	}
	
	public void setStatus(keepAliveStatus status) {
		this.status = status;
	}
	
	public String getProduct() {
		return product;
	}
	
	public void setProduct(String product) {
		this.product = product;
	}
	
	public String getToken() {
		return token;
	}
	
	public void setToken(String token) {
		this.token = token;
	}
	
	public keepAliveErrorResponses getError() {
		return error;
	}
	
	public void setError(keepAliveErrorResponses error) {
		this.error = error;
	}
}
