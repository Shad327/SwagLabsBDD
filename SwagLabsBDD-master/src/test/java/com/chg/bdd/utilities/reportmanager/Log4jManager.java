package com.chg.bdd.utilities.reportmanager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;



public class Log4jManager {
	public static Logger log = LogManager.getLogger(Log4jManager.class);

	/**
	 * Logs info text messages to the Log file & Extent report
	 * 
	 * @param message
	 */
	public static void info(String message) {
		log.info(message);

	}

	/**
	 * Logs debug text messages to the Log file
	 * 
	 * @param message
	 */
	public static void debug(String message) {
		log.debug(message);
	}

	/**
	 * Logs error text messages to the Log file
	 * 
	 * @param message
	 */
	public static void error(String message) {
		log.error(message);
	}

	public static void warn(String message) {
		log.warn(message);

	}

	public static void fatal(String message) {
		log.fatal(message);
	}

	
	 // This is to print log for the beginning of the test case, as we usually run so many test cases as a test suite
	 public static void startTestCase(String sTestCaseName){
	 log.info("**************************************************************************");
	 log.info("$$$$$$$$$$$$        "+sTestCaseName+ "        $$$$$$$$$$$$");
	 log.info("**************************************************************************");
	 }
	 
	 //This is to print log for the ending of the test case
	 public static void endTestCase(){
	 log.info("XXXXXXXXXXXXXXXX          "+"---END of test case---"+"         XXXXXXXXXXXXXXXX");
	 log.info("X");
	 log.info("X");
	 
	 }

}
