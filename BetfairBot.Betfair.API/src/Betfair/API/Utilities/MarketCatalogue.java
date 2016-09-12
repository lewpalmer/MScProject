package Betfair.API.Utilities;

import java.util.List;

public class MarketCatalogue {

	private String marketId;
	private String marketName;
	private String marketStartTime;
	private MarketDescription description;
	private double totalMatched;
	private List<RunnerCatalog> runners;
	private EventType eventType;
	private Competition competition;
	private Event event;
}
