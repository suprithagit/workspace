package codingPra;

import java.util.Scanner;

/*
 * Have the function FirstFactorial(num) take the num parameter being passed and return the factorial of it.
 *  For example: if num = 4, then your program should return (4 * 3 * 2 * 1) = 24.
 *   For the test cases, the range will be between 1 and 18 and the input will always be an integer.
 */
public class Factorial {
	
	 public static int FirstFactorial(int num) {
		    // code goes here  
		    if(num==1)
		    return 1;
		    else {
		      for(int i=1;i<=num;i++){
		        i=i*num;
		      }
		    }
		    return num;
		  }
	 public static void main (String[] args) {  
		    // keep this function call here     
		    Scanner s = new Scanner(System.in);
		    System.out.print(FirstFactorial(s.nextInt())); 
		  }
}
