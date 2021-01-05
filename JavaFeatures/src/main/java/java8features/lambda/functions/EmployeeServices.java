package java8features.lambda.functions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

import org.apache.log4j.Logger;

public class EmployeeServices {

	private static Logger logger = Logger.getLogger(EmployeeServices.class);

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<>();
		empList.add(new Employee(1001, "Aron", "Spain"));
		empList.add(new Employee(1050, "Cindia", "Portugal"));
		empList.add(new Employee(1602, "Zidane", "France"));
		empList.add(new Employee(1453, "Robert", "Belgium"));
		empList.add(new Employee(1500, "Francis", "USA"));
		empList.add(new Employee(1231, "Zlatan", "Sweden"));

		List<Employee> seniorEmpList = new EmployeeServices().getList(empList, n -> n < 1300);
//		for (Employee e : seniorEmpList) {
//			logger.info(e.toString());
//		}
//		double i = 5;
//		double j = 6;
//		double k = i / j;
//		System.out.println(k);
//		seniorEmpList.stream().so
//		Stream<String> stm = Stream.of("Java 8 ", " in ", " action ");
//		stm.forEach(System.out::print);
//		stm.forEach(System.out::print);
		
		seniorEmpList.forEach(System.out::println);
	}

	public List<Employee> getList(List<Employee> empList, Predicate<Integer> argsTest) {
		List<Employee> returnData = new ArrayList<Employee>();
		for (Employee emp : empList) {
			if (argsTest.test(emp.getEmpId())) {
				returnData.add(emp);
			}
		}
		return returnData;
	}
	
	

}
