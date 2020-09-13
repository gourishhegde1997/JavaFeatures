package javafeatures.thread;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ThreadExtnd extends Thread{
	
	@Override
	public void run() {
		System.out.println("Inside ThreadExtnd : "+LocalTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss")));
	}

}
