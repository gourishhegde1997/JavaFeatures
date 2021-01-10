package java8features.optionalClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class FullTimeEmployee extends Employee {
	private Passport passport;

	public FullTimeEmployee() {

	}

	public FullTimeEmployee(String name, Integer id, Double sal, Passport passport) {
		super(name, id, sal);
		this.passport = passport;
	}

	public Optional<Passport> getPassport() {
		// returns passport reference
		return Optional.ofNullable(passport);
		// return Optional.empty();
		// return Optional.of(passport);
	}

	public void setPassport(Passport passportt) {
		// sets passport reference
		this.passport = passportt;
	}

	public static List<FullTimeEmployee> getEmployeeList() {
		List<FullTimeEmployee> employeeList = new ArrayList<>();
		// Creating employee objects with passport

		Passport p1 = new Passport(10121);
		FullTimeEmployee e1 = new FullTimeEmployee("Robert", 102, 10000D, p1);

		Passport p2 = new Passport(10122);
		FullTimeEmployee e2 = new FullTimeEmployee("James", 105, 15000D, p2);

		// Creating employee objects without passport
		FullTimeEmployee e3 = new FullTimeEmployee();
		e3.setId(107);
		e3.setName("Tyrion");
		e3.setSal(21000D);

		FullTimeEmployee e4 = new FullTimeEmployee();
		e4.setId(110);
		e4.setName("Bruce");
		e4.setSal(8000D);

		// adding the objects into a list
		employeeList.add(e1);
		employeeList.add(e2);
		employeeList.add(e3);
		employeeList.add(e4);

		return employeeList;
	}
}
