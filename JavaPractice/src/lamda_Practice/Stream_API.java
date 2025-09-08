package lamda_Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Stream_API {

	public static void main(String[] args) {
		List<Integer> inter= new ArrayList<>();
		for (int i = 0; i < 20; i++) {
			inter.add(i);
		}
		for (int i: inter) {
			System.out.print(" "+i);
		}
		System.out.println();
		inter.forEach(System.out::print);
		/* Now
		 * we are using steram Api
		 */
		System.out.println();
		inter.stream().forEach(System.out::print);
		System.out.println("hi");
		inter.parallelStream().forEach(System.out::print);
		
		List<Integer> numbers= Arrays.asList(1,3,5,7,9);
		System.out.println(numbers);
		System.out.println(numbers.stream().map(i->i*2).reduce(0,(a,b)->a+b));
		
	}
}
