package preInterview;

import java.util.Arrays;
import java.util.List;

public class PrintArrayList {
public static void main(String[] args) {
		
		List<Integer> intarray= Arrays.asList(12,4,6,78,8);
		intarray.forEach(System.out::println);
	}
}
