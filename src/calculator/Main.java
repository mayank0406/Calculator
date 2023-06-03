package calculator;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		   Scanner scanner = new Scanner(System.in);
	        Calculator calculator = new Calculator();

	        System.out.println("Welcome to Calculator!");

	        System.out.print("Enter the first number: ");
	        double num1 = scanner.nextDouble();

	        System.out.print("Enter the second number: ");
	        double num2 = scanner.nextDouble();

	        System.out.println("Select an operation: ");
	        System.out.println("1. Addition");
	        System.out.println("2. Subtraction");
	        System.out.println("3. Multiplication");
	        System.out.println("4. Division");

	        int choice = scanner.nextInt();
	        double result = 0;

	        switch (choice) {
	            case 1:
	                result = calculator.add(num1, num2);
	                System.out.println("Sum: " + result);
	                break;
	            case 2:
	                result = calculator.subtract(num1, num2);
	                System.out.println("Difference: " + result);
	                break;
	            case 3:
	                result = calculator.multiply(num1, num2);
	                System.out.println("Product: " + result);
	                break;
	            case 4:
	                try {
	                    result = calculator.divide(num1, num2);
	                    System.out.println("Quotient: " + result);
	                } catch (ArithmeticException e) {
	                    System.out.println(e.getMessage());
	                }
	                break;
	            default:
	                System.out.println("Invalid choice!");
	        }

	        scanner.close();
	}

}
