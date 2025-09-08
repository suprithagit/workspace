package Lever3programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamAPIDemo {

//1) Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
 public static void main(String args[]) {
	List<Integer> list = Arrays.asList(10,15,8,49,25,98,32); 
	list.stream() .filter(n -> n%2 == 0) .forEach(System.out::println); 
	
	int[] nums= {10,15,8,49,25,98,32};
	/* or can also try below method */
	Map<Boolean, List<Integer>> ma = Arrays.stream(nums).boxed()
			.collect(Collectors.partitioningBy(num -> num % 2 == 0)); 
	System.out.println(ma); 
	
	//2) Given a list of integers, find out all the numbers starting with 1 using Stream functions?
	List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
	myList.stream() .map(s -> s + "")// Convert integer to String .filter(s -> s.startsWith("1")) .forEach(System.out::println);
	.filter(s -> s.startsWith("1")) .forEach(System.out::println);
	
	
	
}
}