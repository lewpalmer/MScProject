package Betfair.API.Utilities;

import java.util.Date;

public class MarketDescription {

	private boolean persistenceEnabled;
	private boolean bspMarket;
	private Date marketTime;
	private Date suspendTime;
	private Date settleTime;
	private MarketBettingType bettingType;
	private boolean turnInPlayEnabled;
	private String marketType;
	private String regulator;
	private double marketBaseRate;
	private boolean discountAllowed;
	private String wallet;
	private String rules;
	private boolean rulesHasDate;
	private double eachWayDivisor;
	private String clarifications;
}
