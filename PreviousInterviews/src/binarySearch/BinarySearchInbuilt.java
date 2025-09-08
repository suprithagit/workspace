package binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchInbuilt {

	public static void main(String[] args) {
		int a[] = {19,5,60,78,6,4,5,68,89,76,11,56,78};
		Arrays.sort(a);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number you want to find");
		int target=sc.nextInt();
		int position=binarySearch(a,target);
		if(position==-1) {
			System.out.println("Not found");
		}else {
		System.out.println("The index position is "+position);
		} 
	}
	
	private static int binarySearch(int a[], int target) {
		int low=0;
		int high=a.length-1;
		while(low<=high) {
		int middlePosition=(low+high)/2;
		int midNum=a[middlePosition];
		
		if(target==midNum) {
			return middlePosition;
		}else if(target<midNum) {
		   high=middlePosition-1;
		   
		}else {
			low=middlePosition+1;
			}
		}
		return -1;
	}
}
