package Betfair.API.Utilities;

import java.util.Date;

public class CancelInstructionReport {

	private InstructionReportStatus status;
	private InstructionReportErrorCode errorCode;
	private CancelInstruction instruction;
	private double sizeCancelled;
	private Date cancelledDate;
}
