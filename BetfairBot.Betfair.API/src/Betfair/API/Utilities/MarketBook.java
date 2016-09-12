package Betfair.API.Utilities;

import java.util.Date;
import java.util.List;

public class MarketBook {

	private String marketId;
	private boolean isMarketDataDelayed;
	private MarketBook status;
	private int betDelay;
	private boolean bspReconciled;
	private boolean complete;
	private boolean inplay;
	private int numberOfWinners;
	private int numberOfRunners;
	private int numberOfActiveRunners;
	private Date lastMatchTime;
	private double totalMatched;
	private double totalAvailable;
	private boolean crossMatching;
	private boolean runnersVoidable;
	private long version;
	private List<Runner> runners;
}
