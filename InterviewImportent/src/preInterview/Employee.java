package preInterview;

public class Employee {
	
		String firstname ;
		int age;
		String city;
		
		public Employee(String string, int age, String string2) {
			this.firstname = string;
			this.age = age;
			this.city = string2;
		}

		public String getFirstname() {
			return firstname;
		}

		public void setFirstname(String firstname) {
			this.firstname = firstname;
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
			return "Employee [firstname=" + firstname + ", age=" + age + ", city=" + city + "]";
		}
		
}
