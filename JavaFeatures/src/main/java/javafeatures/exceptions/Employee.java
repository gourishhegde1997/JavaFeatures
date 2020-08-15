package javafeatures.exceptions;

public class Employee {

	private String empName;
	private int empAge;
	private double empSalary;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpAge() {
		return empAge;
	}

	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}

	public Employee(String empName, int empAge, double empSalary) {
		super();
		this.empName = empName;
		this.empAge = empAge;
		this.empSalary = empSalary;
	}

	public Employee() {
		super();
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empAge=" + empAge + ", empSalary=" + empSalary + "]";
	}

}
