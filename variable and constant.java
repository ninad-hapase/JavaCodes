public class Main {
    public static void main(String[] args) {
        // Step 1: Create a variable
        int number = 10; // This is a variable

        // Step 2: Convert it into a constant
        final int CONSTANT_NUMBER = number; // This is now a constant

        // Step 3: Print the values
        System.out.println("Variable value: " + number);
        System.out.println("Constant value: " + CONSTANT_NUMBER);

        // CONSTANT_NUMBER = 20; // This will cause a compile-time error since it's a constant
    }
}
