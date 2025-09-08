package StreamApIs.BaasicStream;

import java.util.*;
import java.util.stream.Collectors;

import hashMapping.City;
import hashMaps.HashMain;

public class Demo {

	public static void main(String[] args) {
		HashMap<String, Integer> m= new HashMap<>();
		m.put("klk", 5);
		m.put("zli", 6);
		m.put("ghi", 1);
		m.put("abc", 4);
		m.put("mnb", 2);
		m.entrySet().stream().sorted((n1,n2)->n1.getKey().compareTo(n2.getKey())).forEach(System.out::println);
		System.out.println(".......................");
		m.entrySet().stream().sorted((n1,n2)->n1.getValue()-n2.getValue()).forEach(System.out::println);
		
		System.out.println(".......................");
		Map<Integer,String> n=new HashMap<>();
	    n.put(4, "put");
	    n.put(5, "cut");
	    n.put(3, "sut");
	    n.put(1, "mut");
	    n.entrySet().stream().sorted((n1,n2)->n1.getKey()-n2.getKey()).forEach(System.out::println);
	    System.out.println(".......................");
	    n.entrySet().stream().sorted((n1,n2)->n1.getValue().compareTo(n2.getValue())).forEach(System.out::println);
	    
	    System.out.println(".......................");
	    Map<String,Integer> l1= m.entrySet().stream().sorted((m1,m2)-> m2.getValue()-m1.getValue())
	    		.collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
	    		System.out.println(l1);
	    	
	    System.out.println(".......................");		
	    Set<Integer> s=new HashSet<>() ;
	    s.add(848);
	    s.add(784);
	    s.add(4750);
	    s.add(175);
	    s.stream().forEach(System.out::println);
	    Set<Integer> s1=s.stream().collect(Collectors.toSet());
	    System.out.println(s1);
	    s1.forEach(System.out::println);
	    
	    List<Employee> emp =Arrays.asList(new Employee("Suraj", 19, "Nipanni"),
	    		new Employee("Zomer", 59, "Bengaluru"),new Employee("Niraj", 28, "Chikkamagaluru"),
	    		new Employee("Kumar",21,"Chitradurga"), new Employee("Clear", 38, "Magaluru"));
	    	System.out.println(emp);
	    
	    	Map<Integer,List<Employee>> d=emp.stream().collect(Collectors.groupingBy(Employee::getAge));
	    	d.entrySet().stream().sorted((n1,n2)->n1.getKey()-n2.getKey()).forEach(System.out::println);
	    
	}
	    
}

   class Employee{
	String name;
	int age;
	String city;
	
	
	public Employee(String name, int age, String city) {
		this.name = name;
		this.age = age;
		this.city = city;
	}
	
	public Employee() {
		super();
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "Employee [name=" + name + ", age=" + age + ", city=" + city + "]";
	}
	
}