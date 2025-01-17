public class VariableToConstant {
    public static void main(String[] args) {
        // Create a variable
        int number = 42; // Variable can be changed
        System.out.println("Initial value of number: " + number);

        // Convert the variable into a constant
        final int CONSTANT_NUMBER = number; // Use the final keyword to make it a constant
        System.out.println("Constant value: " + CONSTANT_NUMBER);

        // Uncommenting the following line will cause a compilation error because CONSTANT_NUMBER is final
        // CONSTANT_NUMBER = 50;
    }
}

