package iterataos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArraySort {
public static void main(String[] args) {
	List<Integer> al=new ArrayList<>() ;
	al.add(59);al.add(35);al.add(12);al.add(29);al.add(9);
	System.out.println(al);
	for (Integer i : al) {
		System.out.println(i);
	}
	Collections.sort(al);
	System.out.println(al);
	List<String> s= new ArrayList<>();
	s.add("Zara Zara");s.add("Thum He ho");s.add("I love my India");s.add("Jai Ho");s.add("Ashik banaya");
	System.out.println(s);
	Collections.sort(s);
	for (String str : s) {
		System.out.println(str);
	}
}
}
