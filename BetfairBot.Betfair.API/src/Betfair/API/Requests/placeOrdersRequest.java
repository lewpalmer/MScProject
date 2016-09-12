package Betfair.API.Requests;

import java.util.List;

import Betfair.API.Utilities.MarketVersion;
import Betfair.API.Utilities.PlaceInstruction;

public class placeOrdersRequest extends BetfairRequest {
	private String marketId;
	private List<PlaceInstruction> instructions;
	private String customerRef;
	private MarketVersion marketVersion;
	private String customerStrategyRef;
	
	public placeOrdersRequest(String marketId, List<PlaceInstruction> instructions, String custRef, MarketVersion mktVer, String cusStratRef)
	{
		this.marketId = marketId;
		this.instructions = instructions;
		this.customerRef = custRef;
		this.marketVersion = mktVer;
		this.customerStrategyRef = cusStratRef;
	}

}
