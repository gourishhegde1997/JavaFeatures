package javafeatures.collections;

import java.util.Set;
import java.util.TreeSet;

import org.apache.log4j.Logger;

public class Student {

	static Logger logger = Logger.getLogger(Student.class);

	private Integer rollNo;
	private String studentName;

	public Integer getRollNo() {
		return rollNo;
	}

	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Student(int rollNo, String studentName) {
		super();
		this.rollNo = rollNo;
		this.studentName = studentName;
	}

	public Student() {
		this.rollNo = null;
		this.studentName = null;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", studentName=" + studentName + "]";
	}

	private Set<Student> studentSet = new TreeSet<>();
	private Set<Integer> studentRollNoSet = new TreeSet<>();

	public void addStudent(Student student) {
		if (student.getRollNo() == null || student.getStudentName() == null) {
			logger.warn("Either roll number or name of student is not set.");
		} else if (studentRollNoSet.contains(student.getRollNo())) {
			logger.warn("Roll number given is already registered");
		} else {
			studentRollNoSet.add(student.getRollNo());
			studentSet.add(student);
		}
	}
	
	public static void main(String[] args) {
		Student set = new Student();
		
		Student student1 = new Student(101, "Gourisha");
		Student student2 = new Student(101, "Gourisha H");
		Student student3 = new Student();
		
		set.addStudent(student1);
		set.addStudent(student2);
		set.addStudent(student3);
		
		
	}
}
