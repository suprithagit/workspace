package StreamApIs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class EmployeeDeptMain {
	public static void main(String[] args) {
		List<EmployeeDept> arEmp = Arrays.asList(new EmployeeDept("Abcd", 40, "female", "HR"),
				new EmployeeDept("Abcd", 35, "male", "HR"), new EmployeeDept("Ijkl", 20, "female", "IT"),
				new EmployeeDept("Abcd", 28, "male", "HR"));
		
		System.out.println("1-------Print only departments not repeated-------");
		arEmp.stream().map(EmployeeDept::getDepartment).distinct().forEach(System.out::println);

		System.out.println("2----count number of emp in each dept-------");
		Map<String, Long> counting = arEmp.stream()
				.collect(Collectors.groupingBy(n -> n.getDepartment(), Collectors.counting()));
		counting.entrySet().forEach(System.out::println);

		System.out.println("3-------------Average age of male and female employees---------");
		Map<String, Double> avgAge = arEmp.stream()
				.collect(Collectors.groupingBy(n -> n.getGender(), Collectors.averagingInt(n -> n.getAge())));
		System.out.println(avgAge);

	}
}
