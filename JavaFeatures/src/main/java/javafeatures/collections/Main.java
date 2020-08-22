package javafeatures.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

import org.apache.log4j.Logger;

public class Main {
	
	static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		List<Course> courseList = new ArrayList<>();
		courseList.add(new Course("Java"));
		courseList.add(new Course("Hibernate"));
		courseList.add(new Course("Spring5"));
		courseList.add(new Course("ReactJS"));
		
		for(Course course : courseList) {
			logger.info(course);
		}
		
		ListIterator<Course> listIterator = courseList.listIterator();
		while(listIterator.hasNext()) {
			if(listIterator.hasPrevious()) {
				logger.info("Previous : "+listIterator.previous());	
				listIterator.next();
			}
			
			logger.info("Current Item : "+listIterator.next());
		}
		
		List<Course> courseLList = new LinkedList<>();
		courseLList.add(new Course("Java"));
		courseLList.add(new Course("Hibernate"));
		courseLList.add(new Course("Spring5"));
		courseLList.add(new Course("ReactJS"));
		
		Iterator<Course> llistIterator = courseLList.iterator();
		while(llistIterator.hasNext()) {
			logger.info(llistIterator.next());
		}
	}

}
