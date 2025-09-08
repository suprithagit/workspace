package hashMapping;

public class Student {

	private String name;
	private Character grade;
	private Integer age;
	public Student(String name, Character grade, Integer age) {
		super();
		this.name = name;
		this.grade = grade;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Character getGrade() {
		return grade;
	}
	public void setGrade(Character grade) {
		this.grade = grade;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", grade=" + grade + ", age=" + age + "]";
	}
	

}