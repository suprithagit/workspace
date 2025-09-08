package hashMapping;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CityMain {
	public static void main(String[] args) {
		List<City> city=Arrays.asList(new City("Arav", 18, "Mumbai"),
				new City("Raj", 28, "Chennai"),
				new City("Priya", 19, "Udupi"),
				new City("Shiva", 21, "Udupi"),
				new City("Arnav", 18, "Jaipur"));
		
		city.stream().sorted((n1,n2)->n1.getEmpName().toString().compareTo(n2.getEmpName().toString())).forEach(System.out::println);
		System.out.println("By age");
		city.stream().sorted((n1,n2)->n1.getAge()-n2.getAge()).forEach(System.out::println);
		
	Map<String, List<City>> byCity=city.stream().collect(Collectors.groupingBy(City::getCity));
	//System.out.println(byCity);
	byCity.entrySet().stream()
	.sorted((e1,e2)->e1.getKey().compareTo(e2.getKey()))
	.forEach(System.out::println);
	
	Map<Integer, List<City>> byAge=city.stream().collect(Collectors.groupingBy(City::getAge));
	//System.out.println(byCity);
	byAge.entrySet().stream()
	.sorted((e1,e2)->e2.getKey()-e1.getKey())
	.forEach(System.out::println);
	//	LinkedHashMap<String,List<City>> ordering= byCity.entrySet().stream().sorted((e1,e2)->{return e1.getKey()-e2.getKey();})
	//			.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1),LinkedHashMap::new);
	}
}
