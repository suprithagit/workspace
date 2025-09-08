package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

//Program to write array starts ans ends with same character.
// ex: aba, XpX

public class ArrayEndCh {
	public static void main(String[] args) {
		List<String> arr= Arrays.asList("aba","ac","xyz","map","XYX","mAM"); 
		List<Integer> num= Arrays.asList(1,0,1,1,0,0,0,1,0,1,0);
		//count number of zeros and ones
		arr.stream().filter(a->a.length()>0 && a.endsWith(String.valueOf(a.charAt(0))))
		.forEach(n->System.out.println(n));
		
		Integer total=num.stream().reduce(0,Integer::sum);
		System.out.println(total);
		long zero = num.stream().count();
		System.out.println(zero-total);
		
		String str="Super duper hit";
		List<Character> c= new ArrayList<>();
		for(char ch:str.toCharArray()) {
			c.add(ch);
		}
		System.out.println(c);	
		List<Character> result=c.stream().distinct().collect(Collectors.toList());
		
		result.forEach(System.out::print);
	}
}
