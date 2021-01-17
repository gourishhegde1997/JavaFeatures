package java8features.streams;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Comparator;
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
		namesList.stream().sorted((s1,s2) -> s2.compareTo(s1)).forEach(System.out::println);
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
		
		Integer[] array = new Integer[] {1, 3, 5, 7, 9};
		Arrays.sort(array, (Integer i, Integer j) -> j - i);
		Arrays.stream(array).forEach(System.out::println);
		Optional<Integer> max = Arrays.stream(array).reduce(Math::max);
		Optional<Integer> min = Arrays.stream(array).reduce(Math::min);
		System.out.println();
	}

}
