package java8features.optionalClasses;

public class Employee {
	private String name;
	private Integer id;
	private Double sal;

	public Employee() {
		// Default constructor
	}

	public Employee(String name, Integer id, Double sal) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;

	}

	public String getName() {
		return name;
	}

	public Double getSal() {
		return sal;
	}

	public void setSal(Double sal) {
		this.sal = sal;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
}
