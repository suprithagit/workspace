package demo;

import java.util.Scanner;

public class DemoException {

	public static void main (String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        try {
		            // Take input from the user
		            System.out.print("Enter the first number: ");
		            double num1 = scanner.nextDouble();

		            System.out.print("Enter the second number: ");
		            double num2 = scanner.nextDouble();

		            System.out.print("Enter the operator (+, -, *, /): ");
		            char operator = scanner.next().charAt(0);

		            // Perform calculation
		            double result = calculate(num1, num2, operator);
		            System.out.println("Result: " + result);

		        } 
		        catch (ArithmeticException e) {
		            System.out.println("ArithmeticException caught: " + e.getMessage());
		        } 
		        catch (IllegalArgumentException e) {
		            System.out.println("IllegalArgumentException caught: " + e.getMessage());
		        } 
		        catch (Exception e) {
		            System.out.println("Exception caught: " +e.getMessage());
		        }

		        System.out.println("Program execution completed.");
		    }

		    // Method to perform calculation with 'throws'
		    public static double calculate(double num1, double num2, char operator) throws ArithmeticException, IllegalArgumentException {
		    	switch (operator) {
		            case '+':
		                return num1 + num2;
		            case '-':
		                return num1 - num2;
		            case '*':
		                return num1 * num2;
		            case '/':
		                if (num2 == 0) {
		                    throw new ArithmeticException("Division by zero is not allowed.");
		                }
		                return num1 / num2;
		            default:
		                throw new IllegalArgumentException("Invalid operator. Please use +, -, *, or /.");
		}

	}
}

