package javafeatures.exceptions;

import org.apache.log4j.Logger;

public class EmployeeService {

	static Logger logger = Logger.getLogger(EmployeeService.class);
	
	private static void checkEmpSalary(Employee emp) throws EmpSalaryException {
		if (emp.getEmpSalary() < 1000) {
			throw new EmpSalaryException("Poor employee found...: "+emp.getEmpName());
		}
	}
	
	public static void main(String[] args) {
		Employee e1 = new Employee("Nivin Pauli", 23, 1200);
		Employee e2 = new Employee("Jaggesh", 35, 900);
		Employee e3 = new Employee("Morgan Freeman", 67, 8200);
		Employee e4 = new Employee("Satish", 19, 800);
		Employee e5 = new Employee("Diganth", 21, 950);
		
		Employee[] empArray = {e1, e2, e3, e4, e5};
		
		for(Employee e : empArray) {
			try {
				checkEmpSalary(e);				
			} catch (EmpSalaryException exc) {
				logger.error(exc.toString());
			} finally {
				logger.info(e.toString());
			}
		}
	}

}
