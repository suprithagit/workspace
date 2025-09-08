package StreamApIs;

public class EmployeeDept {
	private String name;
	private Integer age;
	private String gender;
	private String department;
	public EmployeeDept(String name, Integer age, String gender, String department) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	@Override
	public String toString() {
		return "EmployeeDept [name=" + name + ", age=" + age + ", gender=" + gender + ", department=" + department
				+ "]";
	}
}
