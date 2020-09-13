package javafeatures.thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class RunnableImpl implements Runnable{

	@Override
	public void run() {
		System.out.println("Inside RunnableImpl : "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
	}

}
