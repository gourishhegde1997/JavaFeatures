package java8features.lambda.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import javafeatures.collections.Student;

public class TestClass2 {

	public static void main(String[] args) {
		List<Student> studentList = new ArrayList<>();
		studentList.add(new Student(101, "Cristiano Ronaldo"));
		studentList.add(new Student(103, "Leo Messi"));
		studentList.add(new Student(102, "Kun Aguero"));

		// To make this static call, toString() function should be declared as static in
		// Student class
//		studentList.forEach(Student::toString());

		// compareByName(Student stud1, Student stud2) is being declared as static in
		// Student class
		studentList.sort(Student::compareByName);
		studentList.forEach(stud -> System.out.println(stud.toString()));

		studentList.stream().map(stud -> stud.getStudentName())
							.map(String::length)
							.forEach(System.out::println);
		
		Comparator<Student> compareByName = (stud1, stud2) -> stud1.getStudentName().compareTo(stud2.getStudentName());
		Collections.sort(studentList, compareByName);
		System.out.println();
		studentList.stream().map(c->c.getStudentName()).forEach(System.out::println);

	}

}
