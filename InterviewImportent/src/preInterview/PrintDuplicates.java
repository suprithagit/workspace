package preInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PrintDuplicates {

	public static void main(String[] args) {
		List<Integer> randnum=Arrays.asList(1,3,14,21,1,3,6,3,19,8,19,14,3);
		Collections.sort(randnum);
		System.out.println(randnum);
		
		Map<Integer, Long> num = randnum.stream()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		num.entrySet().stream().filter(n -> n.getValue() > 1).forEach(System.out::println);
		
	//using java 7
	    Set<Integer> res=new HashSet<>();
		int array[]= {1,3,4,2,1,3,6,3,9,8,9,4,3};
			for(int i=0;i<array.length-1;i++) {
			for(int j=i+1;j<array.length;j++) {
				if(array[i]==array[j]) {
					res.add(array[i]);
				}
			}
		}
			System.out.println(res);
			
	}
}
