package org.campus02.oop;

import java.util.ArrayList;
import java.util.List;

public abstract class LogEntryAnalyzer {
	private List<LogEntry> logEntries = new ArrayList<>();

	public LogEntryAnalyzer() {
	}

	public abstract void analyze();
	public void setLogEntries(List<LogEntry> logEntries) {
		this.logEntries = logEntries;
	}

	protected List<LogEntry> getLogEntries() {
		return logEntries;
	}
}
