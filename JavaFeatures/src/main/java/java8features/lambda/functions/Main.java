package java8features.lambda.functions;

import java.util.ArrayList;
import java.util.List;

import javafeatures.collections.Student;

public class Main {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(104, "Cristiano Ronaldo"));
		studentList.add(new Student(101, "Leo Messi"));
		studentList.add(new Student(105, "Zlatan Ib."));
		studentList.add(new Student(103, "Sergio B."));
		studentList.add(new Student(102, "Aguero Kun"));

		studentList.sort((Student stud1, Student stud2) -> stud1.getStudentName().compareTo(stud2.getStudentName()));
		studentList.forEach(std -> System.out.println(std.toString()));
	}

}
