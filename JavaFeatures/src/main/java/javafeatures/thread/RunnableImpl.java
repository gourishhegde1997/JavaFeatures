package javafeatures.thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import org.apache.log4j.Logger;

public class RunnableImpl implements Runnable{

	private Logger logger = Logger.getLogger(getClass());
	@Override
	public void run() {
		logger.info("run() called");
		System.out.println("Inside RunnableImpl : "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
	}

}
