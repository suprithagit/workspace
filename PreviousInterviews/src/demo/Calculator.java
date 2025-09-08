package demo;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Take input from the user and validate that it's a valid number
            double num1 = getValidNumber(scanner, "Enter the first number: ");
            double num2 = getValidNumber(scanner, "Enter the second number: ");

            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.next().charAt(0);

            // Perform calculation
            double result = calculate(num1, num2, operator);
            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception caught: " + e.getMessage());
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

    // Method to get a valid number from the user
    public static double getValidNumber(Scanner scanner, String prompt) {
        double num = 0;
        boolean validInput = false;
        while (!validInput) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                num = scanner.nextDouble();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next(); // Discard the invalid input
            }
        }
        return num;
    }
}
