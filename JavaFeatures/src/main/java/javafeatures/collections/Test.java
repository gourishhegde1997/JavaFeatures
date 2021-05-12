package javafeatures.collections;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Integer[] numArray = { 0, 56, 37, 98, 13 };
		List<Integer> numList = Arrays.asList(numArray);
		Collections.sort(numList);
		numList.forEach(System.out::println);
		int smallest = numList.get(0);
		int sum = 0;
		for (int i : numList) {
			sum += i;
		}
		System.out.println("Sum without alteration : " + sum);
		System.out.println("Sum after alteration : ");

		if (smallest == 99) {
			System.out.println(sum);
		} else {
			if (smallest / 10 != 9) {
				sum = (sum - smallest) + 90 + (smallest % 10);
				System.out.println(sum);
			} else {
				sum = (sum - smallest) + 99;
				System.out.println(sum);
			}
		}
	}
}
