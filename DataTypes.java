public class DataTypes {

    public static void main(String[] args) {
        int intVar = 10;
        double doubleVar = 20.5;
        char charVar = 'A';
        boolean boolVar = true;
        byte byteVar = 127;
        short shortVar = 300;
        long longVar = 50000L;
        float floatVar = 3.14f;
        String strVar = "Hello, Java!";
        int[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Primitive Data Types:");
        System.out.println("int: " + intVar);
        System.out.println("double: " + doubleVar);
        System.out.println("char: " + charVar);
        System.out.println("boolean: " + boolVar);
        System.out.println("byte: " + byteVar);
        System.out.println("short: " + shortVar);
        System.out.println("long: " + longVar);
        System.out.println("float: " + floatVar);
        System.out.println("\nNon-Primitive Data Types:");
        System.out.println("String: " + strVar);
        System.out.print("int array: ");
        for (int i : intArray) {
            System.out.print(i + " ");
        }
    }
}
