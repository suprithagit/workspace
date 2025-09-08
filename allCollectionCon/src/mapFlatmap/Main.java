package mapFlatmap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
public static void main(String[] args) {
	List<String> citiesWorked1 = Arrays.asList("Chitradurga","Bengaluru","Chennai");
	Employee e1= new Employee(1, "Suman", citiesWorked1);
	
	List<String> citiesWorked2 = Arrays.asList("Mysore","Bengaluru","Hydrabad");
	Employee e2= new Employee(2, "Kavitha", citiesWorked2);
	
	List<String> citiesWorked3 = Arrays.asList("Hubli","Pune","Chennai");
	Employee e3= new Employee(3, "Ram", citiesWorked3);
	
	List<Employee> employees=Arrays.asList(e1,e2,e3);
	System.out.println(employees);
	//getting only id of all emp , 
	List<Integer> ids=new ArrayList<>();
	for (Employee emp : employees) {
		ids.add(emp.getId());
	}
	System.out.println(ids);
	//Using map
	List<Integer> ids1= employees.stream().map(n->n.getId()).collect(Collectors.toList());
	System.out.println(ids1);
	//flatMap
	Set<String> city= employees.stream().flatMap(x->x.getCitiesWorked().stream()).collect(Collectors.toSet());
	System.out.println(city);
	
}
}
