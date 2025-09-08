package stringsConcept;

import java.util.Arrays;
import java.util.List;

public class Anagram {
	public static void main(String[] args) {
		String s1 = "LISTEN";
		String s2 = "SILENT";
		char c[] = s1.toCharArray();
		char d[] = s2.toCharArray();
		if (c.length != d.length) {
			System.out.println("Not annagram");
		}
		Arrays.sort(c);
		Arrays.sort(d);
		
		if (Arrays.toString(c).equals(Arrays.toString(d))) {
			System.out.println("Anagram");
		} else {
			System.out.println("Not Anagram");
		}
	}

}  
