package javafeatures.thread;

public class Course {
	private String courseName;
	private int numberOfSeatsAvailable;
	
	public Course(String courseName, int numberOfSeatsAvailable) {
		super();
		this.courseName = courseName;
		this.numberOfSeatsAvailable = numberOfSeatsAvailable;
	}
	
	public String getCourseName() {
		return courseName;
	}
	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	public int getNumberOfSeatsAvailable() {
		return numberOfSeatsAvailable;
	}
	public void setNumberOfSeatsAvailable(int numberOfSeatsAvailable) {
		this.numberOfSeatsAvailable = numberOfSeatsAvailable;
	}
	
	public void registerForCourse(int rollNo) {
        try {
            if(this.numberOfSeatsAvailable - 1 < 0) {
                throw new Exception("No more seats available for this course");
            }
            System.out.println("Booking successful for roll number : "+rollNo);
            this.numberOfSeatsAvailable -= 1;
            System.out.println("Available seats: " + this.numberOfSeatsAvailable);
        }
        catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
	
	
}
