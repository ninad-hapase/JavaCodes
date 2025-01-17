import java.util.Scanner;

public class ArithmeticOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform arithmetic operations
        double addition = num1 + num2;
        double subtraction = num1 - num2;
        double multiplication = num1 * num2;
        double division = num2 != 0 ? num1 / num2 : Double.NaN; // Handle division by zero
        double modulo = num2 != 0 ? num1 % num2 : Double.NaN;   // Handle modulo by zero

        // Display the results
        System.out.println("\nResults of Arithmetic Operations:");
        System.out.println("Addition: " + addition);
        System.out.println("Subtraction: " + subtraction);
        System.out.println("Multiplication: " + multiplication);

        if (num2 != 0) {
            System.out.println("Division: " + division);
            System.out.println("Modulo: " + modulo);
        } else {
            System.out.println("Division and Modulo: Cannot divide by zero.");
        }

        scanner.close();
    }
}
