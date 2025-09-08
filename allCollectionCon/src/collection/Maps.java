package collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> employee = new HashMap<>();
		employee.put(5, "Suman");
		employee.put(6, "Aman");
		employee.put(9, "Manish");

		System.out.println("using for each and entrySet");
		for (Map.Entry<Integer, String> entry : employee.entrySet()) {
			System.out.println(entry.getKey());
			System.out.println(entry.getValue());
		}

		System.out.println("---------------stream---------");
		employee.entrySet().stream().forEach(System.out::println);

		System.out.println("----------Using for eachjava8 in -----------");
		employee.forEach((keys, values) -> {
			System.out.println(keys);
			System.out.println(values);
		});
		
		System.out.println("----------Sorting in -----------");
		employee.entrySet().stream().sorted((e1,e2)->e1.getValue().toString().compareTo(e2.getValue().toString()))
		.forEach(n->System.out.println(n.getValue()+"="+n.getKey()));

		System.out.println("----------Sorting in rev by Key -----------");
		employee.entrySet().stream().sorted((e1,e2)->e2.getKey()-e1.getKey()).forEach(System.out::println);
		
		System.out.println("-----------normal stream------");
		employee.entrySet().stream().forEach(n -> System.out.println(n.getKey() + " = " + n.getValue()));

		System.out.println("---------Iterator----------");
		Iterator<Entry<Integer, String>> itr = employee.entrySet().iterator();
		while (itr.hasNext()) {
			Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

		System.out.println("---------Using Key Set------- ");
		Iterator<Integer> itr1 = employee.keySet().iterator();
		while (itr1.hasNext()) {
			Integer num = itr1.next();
			System.out.println(num);
			System.out.println(employee.get(num));

		}
    
		System.out.println("Sorting");
		LinkedHashMap<Integer, String> res = employee.entrySet()
			    .stream()
			    .sorted((e1, e2) -> e1.getValue().compareTo(e2.getValue())) // Corrected the sorting lambda
			    .collect(Collectors.toMap(
			        Map.Entry::getKey,
			        Map.Entry::getValue,
			        (e1, e2) -> e1,             // Merge function in case of key collisions (not relevant here)
			        LinkedHashMap::new           // Specify LinkedHashMap to maintain insertion order
			    ));
		res.entrySet().stream().forEach(System.out::println);
	}
}
