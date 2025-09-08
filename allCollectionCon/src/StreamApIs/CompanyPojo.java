package StreamApIs;

public class CompanyPojo {
	String name;
	int age;
	String Place;

	public CompanyPojo(String name, int age, String place) {
		super();
		this.name = name;
		this.age = age;
		Place = place;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPlace() {
		return Place;
	}

	public void setPlace(String place) {
		Place = place;
	}

	@Override
	public String toString() {
		return "CompanyPojo [name=" + name + ", age=" + age + ", Place=" + Place + "]";
	}

}
