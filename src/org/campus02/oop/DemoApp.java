package org.campus02.oop;

import java.time.LocalDateTime;

public class DemoApp {

	public static void main(String[] args) {
		System.out.println(createTestLogEntry()); // Sehen Sie sich diese Methode kurz an

		LogEntryManager logEntryManager = new LogEntryManager();
		for (int i = 0; i < 100; i++) {
			logEntryManager.add(createTestLogEntry());
		}

		// TODO: Erstellen Sie ein Objekt von LogEntryManager
		//  und rufen Sie die die Methode add(…) einhundert Mal auf,
		//  um LogEntryManager mit den Testdaten zu befüllen.
	}


	/*Folgende Methode erstellt einen zufälligen Logentrag und liefert
	diesen retour
	 */
	public static LogEntry createTestLogEntry()
	{
		String[] appNames = new String[] {"App", "Website", "Task1", "Task2", "Task3", "Service1"};
		String[] logLevels = new String[] {"debug", "info", "warning", "error", "fatal", "ente"};
		String[] countries = new String[] {"AT", "DE", "CH", "SI", "PL", "GB"};
		String[] ipAddress = new String[] {"13.112.224.240", "13.115.13.148", "13.210.129.177", "13.210.176.167", "13.228.126.182", "13.228.224.121", "13.230.11.13", "13.230.90.110", "13.55.153.188", "13.55.5.15", "13.56.126.253", "13.56.173.200"};

		
		LogEntry p = new LogEntry(
				LocalDateTime.now().minusMinutes((long)(Math.random() * 1_000_000)).toString(), 
				getRandom(appNames), 
				getRandom(ipAddress),
				getRandom(logLevels),
				getRandomMessage(), getRandom(countries)
				);
		
		
	
		return p;
	}
	
	public static String getRandomMessage()
	{
		String[] arr = new String[] {"Error on creating user", "General error", "System not connected", "Network error", "application crashed"};

		
		String msg = arr[(int) (Math.random() * 100.0) % arr.length];
		
		if (Math.random() * 100 < 50)
		{
			msg += " " + LocalDateTime.now().getNano();
		}
		
		return msg;
	}
	
	public static String getRandom(String[] arr)
	{
		return arr[(int) (Math.random() * 100.0) % arr.length];
	}
}
