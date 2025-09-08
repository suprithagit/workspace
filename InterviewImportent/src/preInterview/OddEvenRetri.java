package preInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class OddEvenRetri {

	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(1, 3, 4, 2, 5, 6, 7, 9, 8, 0, 3, 5);
		// Even
		List<Integer> even = num.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
		System.out.println(even);
		
		List<Integer> odd= num.stream().filter(n->n%2!=0).collect(Collectors.toList());
		System.out.println(odd);
	}
}