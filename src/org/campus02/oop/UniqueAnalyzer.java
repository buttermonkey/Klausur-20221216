package org.campus02.oop;

import java.util.*;

public class UniqueAnalyzer extends LogEntryAnalyzer {
	private List<String> result = new ArrayList<>();

	public UniqueAnalyzer() {
	}

	@Override
	public void analyze() {
		Map<String, Boolean> messageIsUnique = new HashMap<>();
		for (LogEntry logEntry : super.getLogEntries()) {
			messageIsUnique.put(logEntry.getMessage(), !messageIsUnique.containsKey(logEntry.getMessage()));
		}
		result = messageIsUnique.entrySet().stream()
				.filter(Map.Entry::getValue)
				.map(Map.Entry::getKey)
				.toList();
	}

	public List<String> getResult() {
		return result;
	}
}
