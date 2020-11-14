package java8features.streams;

import java.util.Arrays;
import java.util.List;

import org.apache.log4j.Logger;

public class Main {
	
	static Logger logger = Logger.getLogger(Main.class);

	public static void main(String[] args) {
		List<String> namesList = Arrays.asList("Gourisha","Radhika","Vijay","Dattatreya","Sanmati");
		
		// forEach call
		namesList.forEach(System.out::println);
		System.out.println();
		
		// sort call
		namesList.stream().sorted().forEach(System.out::println);
		System.out.println();
		
		// filter method call
		namesList.stream().filter(s->s.startsWith("S")).forEach(System.out::println);
		System.out.println();
		
		logger.info("Run completed");

	}

}
