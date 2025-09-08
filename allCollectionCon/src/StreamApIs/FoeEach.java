package StreamApIs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FoeEach {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 3, 2, 3, 0, 4);
		System.out.println("List " + num);
		Set<Integer> s = new HashSet<>();
		s.add(5);
		s.add(6);
		s.add(7);
		s.add(5);
		System.out.println("Set " + s);

		Map<Integer, String> student = new HashMap<>();
		student.put(101, "Abc");
		student.put(102, "Zbc");
		student.put(101, "Kbc");
		student.put(104, "Mbc");
		System.out.println("map " + student);

		System.out.println("......forEach() method in iterable Interface......");
		num.forEach(System.out::println);
		s.forEach(System.out::println);
		student.entrySet().forEach(System.out::println);

		System.out.println("........Iterating using Lambda expression and foreach....");
		num.forEach(n -> System.out.println(n + " "));
		s.forEach(n -> System.out.println(n + " "));
		student.entrySet().forEach(n -> System.out.println(n + " "));

		System.out.println("......in java 7...");
		for (Integer integer : num) {
			System.out.print(integer + " ");
		}
		for (Integer integer : s) {
			System.out.print(" _ " + integer);
		}
		System.out.println(); // for maps we use Map.Entry<key,value> interface as declaration
		// we use entySet for iterating each value
		for (Entry<Integer, String> ent : student.entrySet()) {
			System.out.println(ent);
		}

	}
}
