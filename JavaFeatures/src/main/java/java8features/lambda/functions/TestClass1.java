package java8features.lambda.functions;

import java.util.Arrays;
import java.util.List;

public class TestClass1 {

	public static void main(String[] args) {
		String[] studentNamesArray = {"Gourisha", "Dattatreya", "Sanmati"};
		List<String> studentNames = Arrays.asList(studentNamesArray);
		studentNames.forEach(c->System.out.println(c));
		System.out.println();
		
		String s1 = "Lambda";
		String s2 = "Function";
		
		StringFormatter strFormatter1 = (str1,str2) -> str1 + " " + str2;
		System.out.println(strFormatter1.format(s1, s2));
		
		StringFormatter strFormatter2 = (str1,str2) -> str1 + "-" + str2;
		System.out.println(strFormatter2.format(s1, s2));
		
		StringFormatter strFormatter3 = (str1,str2) -> str1.toUpperCase().concat(str2.toUpperCase());
		System.out.println(strFormatter3.format(s1, s2));
	}

}
