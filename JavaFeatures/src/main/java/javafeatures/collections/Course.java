package javafeatures.collections;

public class Course implements Comparable<Course>{
	private String courseName;

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Course(String courseName) {
		super();
		this.courseName = courseName;
	}

	@Override
	public String toString() {
		return "Course [courseName=" + courseName + "]";
	}

	@Override
	public int compareTo(Course course) {
		return this.getCourseName().compareTo(course.getCourseName());
	}

}
