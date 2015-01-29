/**
 * Ted Mader
 * Simple Calculator
 * 9/5/2013
 **/

import java.util.Scanner;
 
public class SimpleCalculator {

	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		int operation; // Integers 1-4 represent an operation
		double firstNumber;
		double secondNumber;
		double result;
		
		System.out.println("Choose an operation:\n1-Addition\n2-Subtraction\n3-Multiplication\n4-Division\n5-Exit");
		
		do {
			operation = input.nextInt();
		
			if (operation == 1) { // Addition
				System.out.print("Enter first number: ");
				firstNumber = input.nextDouble();

				System.out.print("Enter second number: ");
				secondNumber = input.nextDouble();

				result = firstNumber + secondNumber;

				System.out.print("The sum is " + result);
			
			} else if (operation == 2) { // Subtraction

				System.out.print("Enter first number: ");
				firstNumber = input.nextDouble();

				System.out.print("Enter second number: ");
				secondNumber = input.nextDouble();

				result = firstNumber - secondNumber;

				System.out.print("The subtrahend is " + result);
			
			} else if (operation == 3) { // Multiplication
			
				System.out.print("Enter first number: ");
				firstNumber = input.nextDouble();

				System.out.print("Enter second number: ");
				secondNumber = input.nextDouble();

				result = firstNumber * secondNumber;

				System.out.print("The product is " + result);
			
			} else if (operation == 4) { // Division
			
				System.out.print("Enter first number: ");
				firstNumber = input.nextDouble();

				System.out.print("Enter second number: ");
				secondNumber = input.nextDouble();

				result = firstNumber / secondNumber;

				System.out.print("The quotient is " + result);
				
			} else if (operation == 5){
				System.out.println("Goodbye");
				System.exit(0);
				
			} else { // My own personal touch
				
				System.out.println("You're doing it wrong.");
			}
		} while (operation < 1 || operation > 5);
	}
}