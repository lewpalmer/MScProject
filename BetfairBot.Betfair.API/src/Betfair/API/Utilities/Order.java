package Betfair.API.Utilities;

import java.util.Date;

public class Order {
	private String betId;
	private OrderType orderType;
	private OrderStatus status;
	private PersistenceType persistenceType;
	private Side side;
	private double price;
	private double size;
	private double bspLiability;
	private Date placedDate;
	private double avgPriceMatched;
	private double sizeMatched;
	private double sizeRemaining;
	private double sizeLapsed;
	private double sizeCancelled;
	private double sizeVoided;
	
}
