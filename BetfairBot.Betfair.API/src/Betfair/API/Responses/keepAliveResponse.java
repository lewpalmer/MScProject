package Betfair.API.Responses;

import Betfair.API.Utilities.keepAliveErrorResponses;
import Betfair.API.Utilities.keepAliveStatus;

public class keepAliveResponse {
	private String token;
	private String product;
	private keepAliveStatus status;
	private keepAliveErrorResponses error;
}
