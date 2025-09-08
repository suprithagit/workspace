package hashMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
	public static void main(String[] args) {
		List<Employee> empDetails = Arrays.asList(new Employee("Gowtham", 28, 30000), new Employee("Prabhu", 32, 15000),
				new Employee("Anil", 24, 28000), new Employee("Mohan", 26, 43000), new Employee("Sangam", 28, 48000));
        System.out.println(empDetails);
		List<Employee> increment = empDetails.stream().map(e -> {
			if (e.getAge() > 25) {
				e.setSalary(e.getSalary() * 1.1);
			}
			return e;
		}).collect(Collectors.toList());
		System.out.println(increment);
		
		List<Employee> res= empDetails.stream()
				.map(n->{
						if(n.getAge()>30) {
							n.setSalary(n.getSalary()*0.15);
							}
						return n;
						}).collect(Collectors.toList());
		res.forEach(System.out::println);
		//System.out.println(increment);
		
	}
	


}
