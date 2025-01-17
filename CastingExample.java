public class CastingExample {
    public static void main(String[] args) {
        
        int intNumber = 100;  
        double doubleNumber = intNumber;  double
        System.out.println("Implicit Casting:");
        System.out.println("Integer value: " + intNumber);
        System.out.println("Double value (after implicit casting): " + doubleNumber);

        
        double originalDouble = 99.99; 
        int castedInt = (int) originalDouble; 
        System.out.println("\nExplicit Casting:");
        System.out.println("Original double value: " + originalDouble);
        System.out.println("Integer value (after explicit casting): " + castedInt);

        long largeNumber = 1_000_000_000_000L; 
        int smallNumber = (int) largeNumber; 
        
        System.out.println("\nExplicit Casting with Data Loss:");
        System.out.println("Original long value: " + largeNumber);
        System.out.println("Integer value (after casting): " + smallNumber);
    }
}
