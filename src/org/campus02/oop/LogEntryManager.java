package org.campus02.oop;

import java.util.ArrayList;
import java.util.List;

public class LogEntryManager {
	private List<LogEntry> logEntries = new ArrayList<>();

	public LogEntryManager() {
	}

	public void add(LogEntry logEntry) {
		logEntries.add(logEntry);
	}

	public List<LogEntry> getLogEntries() {
		return logEntries;
	}
}
