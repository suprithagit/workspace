package StreamApIs.BaasicStream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class WaysToPrint {
	public static void main(String[] args) {
		List<Integer> i= Arrays.asList(2,1,7,3,6,1,4,5,9,1,2);
		List<String> s=Arrays.asList("sun","mon","sat","tue","wen","thu","fri","sun");
		
		System.out.println(i+" "+s);
		i.forEach(System.out::println);
		i.forEach(System.out::println);
		List<String> ll=s.stream().collect(Collectors.toList());
		System.out.println(ll);
	}

}
