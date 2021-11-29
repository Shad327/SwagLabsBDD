package com.chg.bdd.utilities.webactionutils;

public class WaitUtil {
	

	public void pause(int seconds) {

		 try {
		   Thread.sleep(seconds*1000);
		  } catch (InterruptedException e) {
		   e.printStackTrace();
		  }
		 }
}
