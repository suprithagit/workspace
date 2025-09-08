package arrays;

import java.util.Arrays;
import java.util.List;

public class SumArray {
public static void main(String[] args) {
	List<Integer> num= Arrays.asList(10,20,30,40,50);
	
	Integer sum =num.stream().reduce(0,Integer::sum);
	
}
}
