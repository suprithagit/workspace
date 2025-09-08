package StreamApIs.BaasicStream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Terminals_Int {
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(7,1,2,1,2,3,4,5);
		int i1= al.stream().min(Comparator.comparing(Integer::valueOf)).get();
		int i2= al.stream().max(Comparator.comparing(Integer::valueOf)).get();
		
		Optional<Integer> i3= al.stream().findFirst();
		Optional<Integer> i4= al.stream().findAny();
		
		Long c1 =al.stream().count();
		//collect
		List<Integer> l1= al.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
		//reduce
		Integer i5=al.stream().reduce(0, Integer::sum);
		int i6=al.stream().reduce(1,(a,b)->a*b);
		
		System.out.println(" min="+i1+" max="+i2+" first="+i3+ i4+" count="+c1+" sum"+i5);
		System.out.println("Reverse"+ l1);
		System.out.println(i6);
		
		   int product = IntStream.range(2, 5) //2*3*4=24 , starts from 2 and ends 4 which is before 5
                   .reduce((num1, num2) -> num1 * num2)
                   .orElse(-1);
		   System.out.println(product);
		}

}
