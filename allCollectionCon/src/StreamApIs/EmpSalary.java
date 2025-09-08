package StreamApIs;

import java.util.List;
import java.util.stream.Collectors;
import java.util.Arrays;
import java.util.Comparator;
//Sorting reverse order to get first 3 highest salary and to skip first 3 highest salary
public class EmpSalary {
	public static void main(String[] args) {
		Integer arr[]= {10,23,120,40,28,12};
		List<Integer> l= Arrays.asList(arr);
		System.out.println("--------Printing third highest number---------");
		l.stream().sorted(Comparator.reverseOrder()).limit(3).skip(2).forEach(System.out::println);		
		
		List<Employee> emp = Arrays.asList(new Employee("Rishab", "Shetty", 35, 80000),new Employee("Prabhu", "Raj", 25, 20000),
				new Employee("Raj", "Kumar", 30, 60000), new Employee("Prashanth", "Raoy", 22, 30000),
				new Employee("Pruthvi", "Raj", 25, 40000), new Employee("Kareena", "Kapoor", 27, 55000));

		List<Employee> result= emp.stream().sorted((e1, e2) -> (int) (e2.getSalary() - e1.getSalary()))
		.limit(3)
		.collect(Collectors.toList());
		
		result.forEach(System.out::println);
		System.out.println("----------------print only 3rd highest salary");
		result.stream().skip(2).forEach(System.out::println);
		
		System.out.println("----------to print numbers after first three-----");
		List<Employee> result2 = emp.stream() 
				.sorted((e1,e2)->(int)(e2.getSalary()-e1.getSalary()))
				.skip(3).collect(Collectors.toList());
		
		result2.stream().forEach(System.out::println);
		System.out.println("-----------Print 10% Incrementes salara whose age is greater than 25----------");
		 
		List<Employee> increment = emp.stream().map(e->{
			if(e.getAge()>25) {e.setSalary((long) (e.getSalary()*1.10));}
			return e;
		}).collect(Collectors.toList());
		
		increment.forEach(System.out::println);
	}

}
