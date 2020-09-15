package javafeatures.thread;

public class ThreadTest2 {

	public static void main(String args[]) {
		Course cse = new Course("CSE", 1);
		RegisterCourse regObj1 = new RegisterCourse(cse);
		Thread thread1 = new Thread(regObj1);
		RegisterCourse regObj2 = new RegisterCourse(cse);
		Thread thread2 = new Thread(regObj2);
		
		thread1.start();
		thread2.start();
	}

}
