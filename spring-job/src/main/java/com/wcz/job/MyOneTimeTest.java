package com.wcz.job;

import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyOneTimeTest {
	private static Logger logger = Logger.getLogger(MyOneTimeTest.class);
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		logger.debug("---开始执行定时任务---");
	}
}
