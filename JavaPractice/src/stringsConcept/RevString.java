package stringsConcept;

import java.util.Iterator;

public class RevString {
	public static void main(String[] args) {
		String str = "GOD";
		String rev = "";
		String str2 = "";
		
		StringBuffer str1= new StringBuffer(str);
		System.out.println(str1.reverse());	
		// Method 1
		for (int i = str.length() - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);
		}
		System.out.println(rev);

		// Method 2
		char a[] = str.toCharArray();
		for (int i = a.length - 1; i >=0; i--) {
			str2 = str2 + a[i];
		}
		System.out.println(str2);
		
	}
}
