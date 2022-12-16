package org.campus02.oop;

public class MaxLogEntryAnalyzer extends LogEntryAnalyzer {
	private LogEntry logEntry = null;

	public MaxLogEntryAnalyzer() {
	}

	@Override
	public void analyze() {
		LogEntry maxIdEntry = null;
		for (LogEntry entry : super.getLogEntries()) {
			if (maxIdEntry == null || entry.getLogEntryID() > maxIdEntry.getLogEntryID()) {
				maxIdEntry = entry;
			}
		}
		logEntry = maxIdEntry;
	}

	public LogEntry getLogEntry() {
		return logEntry;
	}
}
