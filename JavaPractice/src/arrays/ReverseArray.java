package arrays;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
 
	public static void main(String[] args) {

	int[] a= {1,2,3,4,5,6};
	
	int[] ar= Arrays.stream(a).boxed()
			.sorted(Collections.reverseOrder())
			.mapToInt(Integer::intValue)
			.toArray();		


	System.out.println(Arrays.toString(ar));
	}
}
