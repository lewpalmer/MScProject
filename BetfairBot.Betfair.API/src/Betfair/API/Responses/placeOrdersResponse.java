package Betfair.API.Responses;

import java.util.List;

import Betfair.API.Utilities.ExecutionReportErrorCode;
import Betfair.API.Utilities.ExecutionReportStatus;
import Betfair.API.Utilities.PlaceInstructionReport;

public class placeOrdersResponse {
	private String customerRef;
	private ExecutionReportStatus status;
	private ExecutionReportErrorCode errorCode;
	private String marketId;
	private List<PlaceInstructionReport> instructionReports;
	


}
