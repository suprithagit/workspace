package String;

import java.util.StringJoiner;

public class Palindrome {
	public static void main(String[] args) {
		String str = "Hi I'm Nayan and I can speak Malayalam  ";
		String[] word = str.split(" ");
		for(String w:word) {
			if (isPalindrome(w)) {
				System.out.println(w);
			}
		}

	}

	private static boolean isPalindrome(String str) {
		int i1 = 0;
		int i2 = str.length() - 1;

		while (i2 > i1) {
			if (str.charAt(i1) != str.charAt(i2)) {
				return false;
			}
			i1++;
			i2--;
		}
		return true;
	}

}
