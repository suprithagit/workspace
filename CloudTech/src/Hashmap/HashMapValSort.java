package Hashmap;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMapValSort {
	public static void main(String[] args) {
		Map<String, Integer> student = new HashMap<>();
		student.put("Arun", 101);
		student.put("Varun", 108);
		student.put("Tarun", 105);
		student.put("karun", 109);
		
		System.out.println("---------sort based on values decending order--------");
		student.entrySet().stream().sorted((e1,e2)->(e2.getValue()-e1.getValue()))
		.forEach(n->System.out.println(n.getKey()+" "+n.getValue()));
		
		System.out.println("-----adding to another List---------");
		LinkedHashMap<String, Integer> sortedMap= student.entrySet()
		.stream().sorted((s1,s2)-> {return s1.getValue()-s2.getValue();})
	    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue,(e1,e2)->e1,LinkedHashMap::new));
		
		System.out.println(sortedMap);
		sortedMap.entrySet().stream().forEach(System.out::println);;
		
		System.out.println("--------------Another approach---------");
		student.entrySet().stream().sorted((e1,e2)->(e1.getValue()-e2.getValue())).forEach(System.out::println);
	}
}
