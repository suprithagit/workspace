package demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Reducedemo {
public static void main(String[] args) {
	List<Integer> ai=Arrays.asList(2,12,34,48,9,0,8,1,3,2,4,3,56,7,5);
	Integer r=ai.stream().reduce(0,Integer::sum);
	Integer m=ai.stream().reduce(1,(a,b)->a*b);
	Integer min=ai.stream().sorted().skip(1).findFirst().get();
	Integer max=ai.stream().reduce(0,(a,b)->a>b?a:b);
	System.out.println(r+"  mult :"+m+"  "+min+"  "+ max);
}
}
