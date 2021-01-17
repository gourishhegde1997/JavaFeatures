package java8features.optionalClasses;

import java.util.Arrays;
import java.util.List;
//import java.util.Optional;
//import java.util.stream.Collectors;

public class TesterClass1 {

	public static void main(String[] args) {
		List<Integer> numList = List.of(45, 67, 123, 90, 56);
		Integer[] numArray = { 45, 67, 123, 90, 56 };
		Integer largest = numList.stream().sorted().reduce((e1, e2) -> e1 < e2 ? e2 : e1).orElse(-1);
		Integer smallest = Arrays.stream(numArray).sorted().reduce((e1, e2) -> e1 < e2 ? e1 : e2).orElse(-1);
//		List<Integer> ordered = Arrays.stream(numArray).sorted().collect(Collectors.toList());
		System.out.println(largest);
		System.out.println(smallest);
		
//		int[] numArray = {2, 4, 7, 8, 1};
//		List<Integer> numList = Arrays.asList(n);
		
	}

}
