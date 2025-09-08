package simplePrograms;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

public class MoveOnlyZeroToLast {
	public static void main(String[] args) {
		List<Integer> num= Arrays.asList(1,-4,8,0,-5,9,0,2,0,3);
		//using flatmap
		List<Integer> n1=num.stream().filter(n->n!=0).collect(Collectors.toList());
		List<Integer> n2=num.stream().filter(n->n==0).collect(Collectors.toList());
		List<List<Integer>> res= Arrays.asList(n1,n2);
		List<Integer> finalResult= res.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		System.out.println(finalResult);
		
		//Using forEach
		LinkedList<Integer> result= new LinkedList<>();
		for (Integer integer : num) {
			if(integer!=0) 
				result.add(integer);
		}
		for (Integer integer : num) {
			if(integer==0) 
				result.add(integer);
		}
		System.out.println(result);
		
		//using filter
		List<Integer>num1 =num.stream().filter(n->n!=0).collect(Collectors.toList());
		List<Integer>num2 =num.stream().filter(n->n==0).collect(Collectors.toList());
		List<Integer>num3= new LinkedList<>();	
		for (Integer integer : num1) {
			num3.add(integer);
		}
		for (Integer integer : num2) {
			num3.add(integer);
		}
		System.out.println(num3);
	}
}
