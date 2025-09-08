package mapFlatmap;

import java.util.List;

public class Employee {
	private int id;
	private String name;
	private List<String> citiesWorked;

	public Employee(int id, String name, List<String> citiesWorked) {
		super();
		this.id = id;
		this.name = name;
		this.citiesWorked = citiesWorked;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getCitiesWorked() {
		return citiesWorked;
	}

	public void setCitiesWorked(List<String> citiesWorked) {
		this.citiesWorked = citiesWorked;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", citiesWorked=" + citiesWorked + "]";
	}

}
