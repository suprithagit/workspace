package stringsConcept;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {
	public static void main(String[] args) {

		String str = "super duper hit";
		List<Character> chars = convertStringToCharList(str);
		System.out.println(chars);
		List<Character> c = chars.stream().filter(s -> !s.equals(' ')).distinct().collect(Collectors.toList());
		System.out.println(c);
		StringBuilder sb = new StringBuilder();
		Set<Character> set= convertStringToset(str);
		System.out.println(set);

		for (Character ch : c) {
			sb.append(ch);
		}
		String result = sb.toString();
		System.out.println(result);

	}

	// Create an empty List of character
	// For each character in the String
	// add it to the List
	public static List<Character> convertStringToCharList(String str) {
		List<Character> chars = new ArrayList<>();
		for (char ch : str.toCharArray()) {
			chars.add(ch);
		}
		return chars;
	}
	
	public static Set<Character> convertStringToset(String str) {
		Set<Character> chars = new HashSet<>();	
		for (char ch : str.toCharArray()) {
			chars.add(ch);
		}
		return chars;
	}
	
}
