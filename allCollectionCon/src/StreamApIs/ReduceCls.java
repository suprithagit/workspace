package StreamApIs;

import java.util.Arrays;
import java.util.List;

public class ReduceCls {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(10, 8, 15, 18, 20);
		List<String> words = Arrays.asList("java","j2ee","spring","hibernate");

		Integer addition = num.stream().reduce(0, Integer::sum);
		System.out.println(addition);

		Integer multiplication = num.stream().reduce(1, (a, b) -> a * b);
		System.out.println(multiplication);

		Integer maxVal = num.stream().reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(maxVal);
		
		Integer minVal= num.stream().reduce(Integer::min).get();	
		System.out.println(minVal);
		
		String lengInt= words.stream().reduce((a,b)->a.length()>b.length()?a:b).get();
		System.out.println(lengInt);
	}
}
