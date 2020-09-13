package javafeatures.thread;

public class ThreadTest1 {

	public static void main(String[] args) {
		ThreadExtnd thread1 = new ThreadExtnd();
		RunnableImpl thread2 = new RunnableImpl();
		Thread threadObj = new Thread(thread2);
		
		System.out.println("Starting threads");
		thread1.start();
		threadObj.start();
	}

}
