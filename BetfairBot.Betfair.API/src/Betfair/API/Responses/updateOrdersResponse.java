package Betfair.API.Responses;

import java.util.List;

import Betfair.API.Utilities.ExecutionReportErrorCode;
import Betfair.API.Utilities.ExecutionReportStatus;
import Betfair.API.Utilities.UpdateInstructionReport;

public class updateOrdersResponse {
	private String customerRef;
	private ExecutionReportStatus status;
	private ExecutionReportErrorCode errorCode;
	private String marketId;
	private List<UpdateInstructionReport> instructionReports;
}
