package StreamApIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class EmployeeMain {
	public static void main(String[] args) {
		List<Employee> details=new ArrayList<Employee>();
		List<Employee> empDetails=new ArrayList<Employee>();
		//to add directly we use 'new' keyword and class name
		details.add(new Employee("pruthvi","Raj",35,80000));
		details.add(new Employee("vinay","mohan",25,40000));
		details.add(new Employee("Naveen","kumar",22,20000));
		details.add(new Employee("Anil","Lal",28,50000));
		details.add(new Employee(" ","kala",21,12000));
		details.add(new Employee(null,null,0,0));
		Predicate<Employee> name= n->n.empFirstName!=null && !(n.empFirstName.isBlank());
		// adding Using Arrays class directly 
		List<CompanyPojo> company = Arrays.asList(new CompanyPojo("Nihilent",10, "Chennai"),
				new CompanyPojo("Nihilent",10, "Punae"),
				new CompanyPojo("EwcoBiased",6, "Bengaluru"),
				new CompanyPojo("HCL",30, "Delhi"));
		
		System.out.println(details);
		System.out.println(company);
		
		//1 - Convert to apper case and arrange it into ascending order
		empDetails=	details.stream().filter(name).collect(Collectors.toList());
		System.out.println(empDetails);
		empDetails.stream().map(n->n.empFirstName.toUpperCase()).sorted().forEach(n->System.out.println(n));
		// filtering salary greater than 20000
		
		empDetails.stream().filter(n->n.salary>20000).map(n->n.salary).sorted().forEach(n->System.out.println(n));
		empDetails.stream().map(n->{if(n.getAge()>22) {
			n.setSalary((long) (n.getSalary()*1.10));
		}return n;}).forEach(System.out::println);
	
	}
}
