package javafeatures.thread;

public class RegisterCourse implements Runnable {
	private static int count = 0;
	private Course course;
	public RegisterCourse(Course course) {
		this.course = course;
		count++;
	}

	@Override
	public void run() {
		course.registerForCourse(count);
	}

}
