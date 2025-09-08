package demo;

import java.util.HashMap;
import java.util.Map;

public class ArrIntDemo {
public static void main(String[] args) {
	

	int[] arr =  {1,2, 4, 3, 5, 7, 8, 9}; 
	int target = 10;
	
	Map<Integer,Integer> m= new HashMap<>();
	
	for (int i : arr) {
		m.put(i, 1);
		int temp= target-i;
		
		if(m.containsKey(temp)&& i!=temp) {
			System.out.println(i+" + "+temp+"="+target);
		}
	}
	
}


}
