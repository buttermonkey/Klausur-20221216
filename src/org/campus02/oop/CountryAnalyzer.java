package org.campus02.oop;

import java.util.HashMap;
import java.util.Map;

public class CountryAnalyzer extends LogEntryAnalyzer {
	private Map<String, Integer> result = new HashMap<>();

	public CountryAnalyzer() {
	}

	@Override
	public void analyze() {
		result.clear();
		for (LogEntry logEntry : super.getLogEntries()) {
			if (result.containsKey(logEntry.getCountryID()))
				result.put(logEntry.getCountryID(), result.get(logEntry.getCountryID()) + 1);
			else
				result.put(logEntry.getCountryID(), 1);
		}
	}

	public Map<String, Integer> getResult() {
		return result;
	}
}
