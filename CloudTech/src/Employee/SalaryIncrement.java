package Employee;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SalaryIncrement {
	public static void main(String[] args) {
		List<Employee> emp = Arrays.asList(new Employee("Amar", 35, 101, 60000), new Employee("Kumar", 25, 101, 60000),
				new Employee("Ajay", 38, 101, 40000), new Employee("Shilpa", 28, 101, 30000),
				new Employee("Swathi", 19, 101, 10000), new Employee("Praveen", 46, 101, 900000));
		System.out.println("----------Increment Salary whose age is more than 25-----------");
		
		List<Employee> increment = emp.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * (1.10));
			}
			return e;
		}).collect(Collectors.toList());
		
		increment.forEach(System.out::println);

		System.out.println("---------------My approach only prints salary-----------");
		emp.stream().filter(n -> n.getAge() > 25).map(n -> n.getSalary() )
		.forEach(System.out::println);
		emp.stream().filter(n -> n.getAge() > 25).map(n -> n.getSalary() + n.getSalary() * 0.1)
				.forEach(System.out::println);
	}
}
