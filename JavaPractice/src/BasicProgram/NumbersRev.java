package BasicProgram;

import java.util.Scanner;


public class NumbersRev {
 
	//private static final Logger = logger.getLogger(NumbersRev.class);
	
	public static void main(String[] args) {
		java.util.Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int num=sc.nextInt();

		System.out.println("\n Printing number 1 to n");
		for(int i =1 ; i<=num; i++) {
			System.out.print(i + " " );
		}
		System.out.println("\n The Reverse order : ");
		for(int i=num; i>=1 ;i--) {
			System.out.print(i +" ");
		}
		
		System.out.print("\n Addition of all numbers :");
		int a=0;
		for(int i=1 ; i<=num; i++) {
			a+=i;
		}
		System.out.println(a);
		
		System.out.println("Checking the number even or odd : " + num + " ");
		if(num%2==0) {System.out.print("The number is even");}
		else {System.out.print("The number is odd");}
		
		System.out.println("\n Multiplication of given number num: ");
		for(int i=1;i<=10;i++) {
			System.out.println(num+" * "+ i +" = " + num*i);
		}
		
		System.out.println("\n Multiplication of given Number like 1 to 10 : ");
		for(int i=1 ; i<=num; i++) {
			for(int j=1; j<=10 ;j++) {
				System.out.println(i+" * "+ j+ " = " +j*i );
			}
		}
		
		System.out.println("Cheking Prime or not");
		if(isPrime(num)) {}
		
		java.util.Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the Number to check Palindrome or not : ");
		int pnum=sc.nextInt();
		if(isPalindrome(pnum)) {}

	}

	private static boolean isPalindrome(int pnum) {
		// TODO Auto-generated method stub
		String str = Integer.toString(pnum);
		String reverse="";
		
		return true;
	}

	private static boolean isPrime(int n) {
//	int reverse=0;
//	
//		while(n!=0) {
//			reverse=reverse*10+n%10;
//			n/=10;
//		}
//		// TODO Auto-generated method stub
		return false;
	}
	
}
