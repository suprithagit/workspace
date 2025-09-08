package constructors;

public class Student {
	String name;
	int age;
	int studentId;
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", studentId=" + studentId + "]";
	}

	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(String name, int age, int studentId) {
		super();
		this.name = name;
		this.age = age;
		this.studentId = studentId;
	}
	
	
	
}
