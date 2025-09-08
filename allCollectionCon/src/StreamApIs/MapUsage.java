package StreamApIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class MapUsage {
	public static void main(String[] args) {
		List<String> st = Arrays.asList(null,"Jcb","bhuvi", "bus", "car", "Van", "Car", "auto");
		System.out.println(st);
		List<String> upperCase = new ArrayList<>();

		//we get null pointer exception to perform this operation so need to handle
		for (String name : st) {
			if(name!=null)
			upperCase.add(name.toUpperCase());
			}
		System.out.println(upperCase);
		
		//1==>Converting to upper case Using Stream
		upperCase=st.stream().filter(n->n!=null).map(n->n.toUpperCase()).sorted().collect(Collectors.toList());
		System.out.println(upperCase);
		upperCase.stream().distinct().forEach(n->System.out.println(n));
		System.out.println("---------filtering car--------");
		st.stream().filter(n->n!=null && n.equalsIgnoreCase("car")).forEach(System.out::println);
		System.out.println("-------------------------------------");
		//2==>counting each word
		for (String l : upperCase) {
			System.out.print(l.length()+",");
		}
		upperCase.stream().map(n->n.length()).forEach(System.out::print);
		st.stream().filter(n->n!=null).map(n->n.toUpperCase()).distinct()
		.sorted(Comparator.reverseOrder()).forEach(n->System.out.println(n));	
	}
}
