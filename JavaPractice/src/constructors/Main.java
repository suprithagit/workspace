package constructors;

public class Main {
	public static void main(String[] args) {
		//constructor.Student
		Student s1= new Student(); //java created default constructor for all its variables
		//Initializes by its default value
		System.out.println(s1); // O/P: Student [name=null, age=0, studentId=0] 
		Student s2= new Student("Maya", 20, 101);
		System.out.println(s2);
		Student s3= new Student();
		s3.name="Swapna";
		s3.age= 24;
		System.out.println(s3); //Here if some details not available also it can print with default value.
		
	}
}

