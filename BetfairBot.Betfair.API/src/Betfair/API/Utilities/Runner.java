package Betfair.API.Utilities;

import java.util.Date;
import java.util.List;

public class Runner {

	private long selectionId;
	private double handicap;
	private RunnerStatus status;
	private double adjustmentFactor;
	private double lastPriceTraded;
	private double totalMatched;
	private Date removalDate;
	private StartingPrices sp;
	private ExchangePrices ex;
	private List<Order> orders;
	private List<Match> matches;
}
