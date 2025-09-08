package StreamApIs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class StreamBasic {
	public static void main(String[] args) {
		List<Integer> num = Arrays.asList(17, 14, 15, 8, 10, 15);
		num.stream().sorted().forEach(n->System.out.print(n));
		System.out.println();
        num.stream().distinct().sorted().forEach(n->System.out.print(n));
        System.out.println();
		//It has three Streams sorted,mapping and doubling 
		num.stream().sorted().map(n -> n * 2).forEach(n -> System.out.print(n+","));
	    System.out.println();
		//Performing operations on odd num
		num.stream().filter(n->n%2==1).sorted().map(n->n*2).forEach(n->System.out.println(n));
		
		//By creating Object
		System.out.println("By Creating Objects");
		Predicate<Integer> pre=n->n%2==1;
		Function<Integer,Integer> fun=n->n*2;
		num.stream().filter(pre).sorted().map(fun).forEach(n->System.out.println(n));
		long number=num.stream().filter(pre).count();
		System.out.println(number);
		//Reverse
		num.stream().sorted(Comparator.reverseOrder()).forEach(n->System.out.print(n+","));
		System.out.println("Reverse Order");
		num.stream().distinct().sorted((e1,e2)->e2-e1).forEach(System.out::println);
		
		
		//Strings
		
		List<String> str=Arrays.asList("Ar","vn","Ar","kn","Sn");
		//str.stream().sorted().forEach(System.out::println);	
		str.stream().distinct().sorted((e1,e2)->e2.toString().compareTo(e1.toString())).forEach(System.out::println);
	}

}
