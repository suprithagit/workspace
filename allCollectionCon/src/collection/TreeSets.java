package collection;

import java.util.HashSet;

public class TreeSets {
	public static void main(String[] args) {
		java.util.Set<Integer> hs= new HashSet<>();
		hs.add(5);
		hs.add(8);
		hs.add(2);
		hs.add(9);
		
		java.util.Set<Integer> ts = new java.util.TreeSet<>();
		ts.addAll(hs);	
		System.out.println(ts);
	}
}
