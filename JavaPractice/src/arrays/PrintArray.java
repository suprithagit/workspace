package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PrintArray {
	public static void main(String[] args) {
		int []a= {1,6,8,20,7,10};
		for (int i=0 ;i<a.length;i++) {
		System.out.print(a[i]+"  ");
		}
		
		System.out.println("\n Print array in acending order :");
		Arrays.sort(a);
		for (int i=0 ;i<a.length;i++) {
			System.out.print(a[i]+"\n");
			}
		System.out.println("Print array in acending order :");
		List<Integer> ar= new ArrayList<>();
		for(int i=0 ; i<=a.length-1;i++) {
			ar.add(a[i]);
		}
		Collections.sort(ar);
		System.out.println(ar);
		Collections.reverseOrder();
		Collections.sort(ar);
		System.out.println(ar);
	}

}
