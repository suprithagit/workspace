package stringsConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Removecharacter {
	public static void main(String[] args) {
		String str="Super Special Dishes ";
		System.out.println("Remove c from sentence");
		System.out.println(str.replaceAll("c", ""));
		
		Stream<String> s=Arrays.stream(str.split(" "));
		s.filter(n->n!="c").forEach(System.out::print);
		System.out.println();
		//Reverse Each Word
		Stream<String> sp=Arrays.stream(str.split(" "));
		List<String> li=sp.map(n->new StringBuilder(n).reverse().toString()).collect(Collectors.toList());
		String result = String.join(" ", li);
		System.out.println(result);
		
	}

}
