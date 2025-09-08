package binarySearch;

import java.util.Arrays;

public class BinaryDemo {
	public static void main(String[] args) {
		BinaryDemo bd= new BinaryDemo();
		int a[] = {19,2,45,69,20,38,5,4,7,8,3};
		int target=20;
		Arrays.sort(a);
		for (int i : a) {
			System.out.println(i);
		}
	
		System.out.println(Arrays.binarySearch(a, 7));
		for(int ar:a) {
		System.out.print(ar+" ");
		}
		System.out.println();
		Boolean b=bd.BinarySearch(a,0,a.length-1,target);
		if(b==true) {
			System.out.println("yes");
		}else {
			System.out.println("not found");
		}
		
		
				
	}

	private static Boolean BinarySearch(int[] a, int start, int end, int target) {
		// TODO Auto-generated method stub
		if(start<=end) {
			int mid=(start+end)/2;
			
			if(a[mid]==target) 
				return true;
			if(target<a[mid])
				return BinarySearch(a, start, mid+1, target);
			if(target>a[mid])
				return BinarySearch(a, mid+1, end, target);
			
		}
		return false;
		
	}

}
