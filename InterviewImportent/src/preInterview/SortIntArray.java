package preInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SortIntArray {
	 public static void main(String[] args) {
		int arr[] = {0,1,0,1,0,1,0,0};
		List<Integer> reverse=Arrays.stream(arr).boxed().sorted((e1,e2)->e2-e1).collect(Collectors.toList());
	 reverse.forEach(System.out::println);
	 }			
}
