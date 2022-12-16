package org.campus02.oop;

import java.util.ArrayList;
import java.util.List;

public class FilterAnalyzer extends LogEntryAnalyzer {
	private final List<LogEntry> result = new ArrayList<>();
	private final String logLevel;

	public FilterAnalyzer(String logLevel) {
		this.logLevel = logLevel;
	}

	@Override
	public void analyze() {
		for (LogEntry logEntry : super.getLogEntries()) {
			if (logEntry.getLogLevel().equals(logLevel))
				result.add(logEntry);
		}
	}

	public List<LogEntry> getResult() {
		return result;
	}

	public String getLogLevel() {
		return logLevel;
	}
}
