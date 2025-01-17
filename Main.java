public class Main{

    int instanceVar = 10;

    static int staticVar = 20;

    public void instanceMethod() {
        int localVar = 30;


        System.out.println("Inside method:");
        System.out.println("Local Variable: " + localVar);
        System.out.println("Instance Variable: " + instanceVar);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void staticMethod() {
        int localVarStatic = 40;

        System.out.println("\nInside static method:");
        System.out.println("Local Variable in static method: " + localVarStatic);
        System.out.println("Static Variable: " + staticVar);
    }

    public static void main(String[] args) {
        Main obj = new Main();

        obj.instanceMethod();


        Main.staticMethod();


        System.out.println("\nOutside methods:");
        System.out.println("Instance Variable (via object): " + obj.instanceVar);
        System.out.println("Static Variable (via class): " + Main.staticVar);
    }
}
