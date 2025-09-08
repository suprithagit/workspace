package preInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class ConsecutiveNum {
 
	public static void main(String[] args) {
		
		int number[]= {4,5,7,3};
		Arrays.sort(number);
		int i=0;
		while(i<number.length) {
			if(number[i]-number[i-1]==1) {
				
			}else {
				System.out.println(number[i-1]+1);
			}
			i++;
		}
		List<Integer> n= Arrays.asList(4,5,7,3);
		List<Integer> naturalOrd= n.stream().sorted().collect(Collectors.toList());
		System.out.println(naturalOrd);
		
		List<Integer> l= new LinkedList<>(naturalOrd);
		
		
		
	}
}
