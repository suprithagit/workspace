package StreamApIs.BaasicStream;

import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapSorting {
	public static void main(String[] args) {
		Map<String, Integer> s1 = new HashMap<>();
		s1.put("Aru", 3);
		s1.put("Vru", 2);
		s1.put("Kru", 1);
		s1.put("Bru", 4);
		s1.entrySet().stream().sorted((n1,n2)-> n1.getValue()-n2.getValue()).forEach(System.out::println);
		System.out.println("..........By Key.......");
		s1.entrySet().stream().sorted((e1,e2)->e1.getKey().compareTo(e2.getKey())).forEachOrdered(System.out::println);
		
		System.out.println("..Reverse sort by value and collecting to another map..");
		Map<String, Integer> s2= s1.entrySet().stream().sorted((n1,n2)-> n2.getValue()-n1.getValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(n1,n2)->n2,LinkedHashMap::new));	
		System.out.println(s2);
		//By key Reverse sort
		Map<String, Integer> s3=s1.entrySet().stream().sorted((e1,e2)->e2.getKey().compareTo(e1.getKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e2,LinkedHashMap::new));
		System.out.println(s3);
		
		// sort by Key
		Map<String, Integer> budget = new HashMap<>();
		budget.put("clothes", 120);
		budget.put("grocery", 150);
		budget.put("transportation", 100);
		budget.put("utility", 130);
		budget.put("rent", 1150);
		budget.put("miscellneous", 90);
		budget.put("Appless", 85);
		System.out.println("map before sorting: " + budget); 
		// Sort By Length of Key
		Map<String, Integer> sorted =budget.entrySet().stream().sorted((e1,e2)->{return e1.getKey().length()-e2.getKey().length();}) 
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),
						(e1, e2) -> e1, LinkedHashMap::new));
		System.out.println("map aftersorting by keys: " + sorted);
		
		Map<String, Integer> so =budget.entrySet().stream()
				.sorted((e1,e2)->{return (e1.getKey()).compareTo(e2.getKey());}) 
				.collect(Collectors.toMap(e -> e.getKey(), e -> e.getValue(),
						(e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(so);
		
//		public int compare(Object o1, Object o2)   
//		{  
//		return ((Comparable) ((Map.Entry) (o1)).getValue()).compareTo(((Map.Entry) (o2)).getValue());  
//		} 

	}

}
