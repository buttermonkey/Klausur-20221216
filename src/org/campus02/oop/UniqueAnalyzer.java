package org.campus02.oop;

import java.util.*;

public class UniqueAnalyzer extends LogEntryAnalyzer {
	private List<String> result = new ArrayList<>();

	public UniqueAnalyzer() {
	}

	@Override
	public void analyze() {
		Set<String> uniqueMessages = new HashSet<>();
		for (LogEntry logEntry : super.getLogEntries()) {
			uniqueMessages.add(logEntry.getMessage());
		}
		result = uniqueMessages.stream().toList();
	}

	public List<String> getResult() {
		return result;
	}
}
