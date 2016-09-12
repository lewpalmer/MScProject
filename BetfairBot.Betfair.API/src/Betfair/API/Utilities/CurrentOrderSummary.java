package Betfair.API.Utilities;

import java.util.Date;

public class CurrentOrderSummary {

	private String betId;
	private String marketId;
	private long selectionId;
	private double handicap;
	private PriceSize priceSize;
	private double bspLiability;
	private Side side;
	private OrderStatus status;
	private PersistenceType persistenceType;
	private OrderType orderType;
	private Date placedDate;
	private Date matchedDate;
	private double averagePriceMatched;
	private double sizeMatched;
	private double sizeRemaining;
	private double sizeLapsed;
	private double sizeCancelled;
	private double sizeVoided;
	private String regulatorAuthCode;
	private String regulatorCode;
	private String customerOrderRef;
	private String customerStrategyRef;
}
