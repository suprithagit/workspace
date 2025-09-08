package simplePrograms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ArrangeInt {
	public static void main(String[] args) {
		List<Integer> num=Arrays.asList(5,7,9,0,4,1,0,5,0);
		List<Integer> result =num.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		System.out.println(result);
	}

}
