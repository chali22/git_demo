package com.wcz.job;

import org.apache.log4j.Logger;

public class MyTimeOne {
	private static Logger logger = Logger.getLogger(MyTimeOne.class);
	public void sayHi() {
	   logger.debug(System.currentTimeMillis()/1000/60 + "-----Hello....");
	}
}
