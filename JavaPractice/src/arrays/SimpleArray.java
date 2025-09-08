package arrays;

import java.util.Iterator;

public class SimpleArray {

	public static void main(String[] args) {
		char ch[] = { 'a', 'b', 'c', 'd' };
		System.out.println(ch.length + "...." + ch.equals(ch) + " " + ch);
		for (char c : ch) {
			System.out.println(c);
		}
		String s[] = { "Ravi", "Kavi", "Savi", "Navi", "Pavi" };
		int a[] = { 1, 2, 3, 4, 5 };
		System.out.println(s.length + " "+a+" "+s);
		for (int i : a) {
			System.out.println(i);
		}
		for (String str : s) {
			System.out.println(str);
		}
		for(int i=0;i<s.length;i++) {
			System.out.println(s[i]);
		}

	}

}
