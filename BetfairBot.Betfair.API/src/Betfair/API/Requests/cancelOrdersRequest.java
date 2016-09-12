package Betfair.API.Requests;

import java.util.List;

import Betfair.API.Utilities.CancelInstruction;

public class cancelOrdersRequest extends BetfairRequest {
	 
	private String marketId;
	private List<CancelInstruction> instructions;
	private String customerRef;
	
	public cancelOrdersRequest(String mktId, List<CancelInstruction> instructions, String custRef)
	{
		this.marketId = mktId;
		this.instructions = instructions;
		this.customerRef = custRef;
	}
}
