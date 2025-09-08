package StreamApIs;

public class Employee {
	String empFirstName;
	String empLastName;
	int age;
	long salary;
	
	public Employee(String empFirstName, String empLastName, int age, long salary) {
		super();
		this.empFirstName = empFirstName;
		this.empLastName = empLastName;
		this.age = age;
		this.salary = salary;
	}
	
	public String getEmpFirstName() {
		return empFirstName;
	}

	public void setEmpFirstName(String empFirstName) {
		this.empFirstName = empFirstName;
	}

	public String getEmpLastName() {
		return empLastName;
	}

	public void setEmpLastName(String empLastName) {
		this.empLastName = empLastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getSalary() {
		return salary;
	}

	public void setSalary(long salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empFirstName=" + empFirstName + ", empLastName=" + empLastName + ", age=" + age
				+ ", salary=" + salary + "]";
	}

}
