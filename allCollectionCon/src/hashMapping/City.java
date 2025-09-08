package hashMapping;

public class City {
	private String empName;
	private int age;
	private String city;
	public City(String empName, int age, String city) {
		super();
		this.empName = empName;
		this.age = age;
		this.city = city;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "City [empName=" + empName + ", age=" + age + ", city=" + city + "]";
	}
	
	
}
