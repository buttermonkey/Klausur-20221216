package org.campus02.oop;

public class LogEntry {
	private String date;
	private String applicationName;
	private String iPAddress;	
	private String logLevel;
	private String message;
	private String countryID;
	private int logEntryID;

	
	public LogEntry(String date, String applicationName, 
			String iPAddress, String logLevel, String message,
			String countryID) {

		// YOUR IMPLEMENTATION
		
		// Fallback-Implementierung für logEntryID - Bitte entfernen
		logEntryID = (int) (Math.random()  * 10000); // Fallback-Implementierung für logEntryID
	}


	// IMPLEMENT Getter / Setter
	
	
	
}
