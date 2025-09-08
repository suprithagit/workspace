package demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class DemoArrayList {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(1,2,7,8,10,83,9,6,7,8,10,8,2);
		System.out.println("**********print the repeated number");
		Map<Integer,Long> r=l.stream()
				.collect(Collectors.groupingBy(n->n,Collectors.counting()));
		
		r.entrySet().stream().filter(n->n.getValue()>1).
		forEach(System.out::println);
		
		System.out.println("***************** Repeated letters of a given String");
		String s="Malayalam Language is a good language";
		List<Character> c = new LinkedList<>();

		for (int i = 0; i <= s.length() - 1; i++) {
			c.add(s.charAt(i));
		}

		Map<Character,Long> let=c.stream().filter(n->!n.equals(' ')).collect(
				Collectors.groupingBy(n->n,Collectors.counting()));
		let.entrySet().stream().filter(n->n.getValue()>1).forEach(System.out::println);
		
		System.out.println("Reverse each word of given String");
		String [] spl=s.split(" ");
		
		String reversedString = Arrays.stream(spl)
                .map(n -> new StringBuilder(n).reverse().toString()) // Reverse each word
                .reduce((w1, w2) -> w1 + " " + w2) // Combine words with a space
                .orElse("");
		System.out.println(reversedString);
		
//		String reversedString = Arrays.stream(word);
//		for (int i = 0; i < word.length; i++) {
//			System.out.println();
//		}
	}
}
