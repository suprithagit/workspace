package StreamApIs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class List_To_Map {
	public static void main(String[] args) {
		List<Integer> l1= Arrays.asList(5,6,7,8,8,9);
		Set<Integer> s1= new HashSet<>();	
		Map<Integer, Integer> listmap= new HashMap<>();
	
		//adding List to set and it removes duplicate
		for (Integer integer : l1) {
			s1.add(integer);
		}
		//adding List to map and it removes duplicate
		for (Integer integer : l1) {
			listmap.put(integer, integer);
		}
		System.out.println("List "+l1+" set "+s1 +" map "+listmap);
		
		// General Iteration 
		for (Map.Entry<Integer, Integer> entry : listmap.entrySet()) {
			Integer key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key+" "+ val);
		}
		//reduce code
		for (Entry<Integer, Integer> entry : listmap.entrySet()) {
			System.out.println(entry);
		}
	}
}
