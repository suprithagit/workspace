package StreamApIs;

import java.util.Arrays;
import java.util.Comparator;

public class StingLongest {
	public static void main(String[] args) {
		String input = "Be not afraid of greatness, some are born great, some achieve ,greatness and some have greatness thrust upon them";
		
		String longWord = Arrays.stream(input.split(" "))
				.max(Comparator.comparingInt(String::length))
				.orElse(null)
				.toString();
		System.out.println(longWord + " = " + longWord.length());

		String LongSentence = Arrays.stream(input.split(","))
				.max(Comparator.comparing(String::length))
				.orElse(null)
				.toString();
		System.out.println(LongSentence + " = " + LongSentence.length());
		
		String shortWord=Arrays.stream(input.split(" "))
				.min(Comparator.comparing(String::length))
				.orElse(null)
				.toString();
		System.out.println(shortWord+" = "+shortWord.length());
	}
}