package java8features.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

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
		
		// reduce method call
		Optional<String> longest = namesList.stream().reduce((s1, s2) -> {
			return s1.length() > s2.length() ? s1 : s2;
		});
		System.out.println("Longest Name is : " + longest.get());
		
		logger.info("Run completed");
		
		int[] array = new int[] {1, 3, 5, 7, 9};
	}

}
