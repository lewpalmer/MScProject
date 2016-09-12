package Betfair.API.Requests;

import java.util.List;

import Betfair.API.Utilities.UpdateInstruction;

public class updateOrdersRequest extends BetfairRequest {
	private String marketId;
	private List<UpdateInstruction> instructions;
	private String customerRef;
	
	public updateOrdersRequest(String mktId, List<UpdateInstruction> instructions, String custref)
	{
		this.marketId = mktId;
		this.instructions = instructions;
		this.customerRef = custref;
	}
}
