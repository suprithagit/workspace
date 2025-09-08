package demo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StringlengthDemo {
	//Find a longest substring in a given string without repeating charcters
	public static void main(String[] args) {
		String s= "hi i am attending interviews";
	
		
		List<String> strlist=new ArrayList<>();
		String[] a=s.split(" ");
		
		for (String str : a) {
			strlist.add(str);
		}
		System.out.println(strlist);
		
		
		
		List<Character> ch=new ArrayList<>();
		
		for (String li : strlist) {
			
			for(int i = 0; i<li.length();i++) {
				ch.add(li.charAt(i));
	     }
			
		}
		
		List<Character> r= ch.stream().distinct().collect(Collectors.toList());
		System.out.println(r);
		 
		//pravin@avap-agile.com
		
	}

}
