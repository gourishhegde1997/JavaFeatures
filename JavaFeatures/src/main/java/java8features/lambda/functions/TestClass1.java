package java8features.lambda.functions;

import java.util.Arrays;
import java.util.List;

public class TestClass1 {

	public static void main(String[] args) {
		String[] studentNamesArray = {"Gourisha", "Dattatreya", "Sanmati"};
		List<String> studentNames = Arrays.asList(studentNamesArray);
		studentNames.forEach(c->System.out.println(c));
	}

}
