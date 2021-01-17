package java8features.optionalClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class EmployeeStarter {
	public static void main(String[] args) {
		// Code to retrieve employees and to store them in a list called employeesList
		List<FullTimeEmployee> employeesList = FullTimeEmployee.getEmployeeList();
		List<Integer> passportNumbers = new ArrayList<>();
		
		// List to collect the passport numbers
		for (FullTimeEmployee employee : employeesList) {
			// if(employee.getPassport() != null)
			// passportNumbers.add(employee.getPassport().getPassportNo());

			Optional<FullTimeEmployee> optEmp = Optional.of(employee);
			passportNumbers.add(optEmp.flatMap(FullTimeEmployee::getPassport).map(Passport::getPassportNo).orElse(-1));

			// passportNumbers.add(employee.getPassport().orElse(new Passport(0)).getPassportNo());
		}
		passportNumbers.forEach(x -> System.out.println("Passport number: " + x));

	}
}
