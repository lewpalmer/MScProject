package Betfair.API.Responses;

import java.util.List;

import Betfair.API.Utilities.CancelInstructionReport;
import Betfair.API.Utilities.ExecutionReportErrorCode;
import Betfair.API.Utilities.ExecutionReportStatus;

public class cancelOrdersResponse extends BetfairResponse {
	private String customerRef;
	private ExecutionReportStatus status;
	private ExecutionReportErrorCode errorCode;
	private String marketId;
	private List<CancelInstructionReport> instructionReports;
}
