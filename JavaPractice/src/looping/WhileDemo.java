package looping;

import java.util.Scanner;

public class WhileDemo {

	public static void main(String[] args) {
		System.out.println("While loop Executes block of code untill it is true repeatdly: ex: click enter in console ");
		Scanner sc =new Scanner(System.in);
		String name= "";
		
		while(name.isBlank()) {
			System.out.println("Enter the valid name :");
			name=sc.nextLine();		
			}
		System.out.println("Completed while");
		
		System.out.println("Do while is same but it is made sure the code should execute atleast once and later checks the condition  ");
		String city;
		do {
			System.out.println("Enter your City: ");
			city=sc.nextLine();
		}while(city.isBlank());
		System.out.println("Out of the loop");
	}
}
