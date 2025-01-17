public class VariableAccessExample {
    int globalVariable = 10;

    public void accessVariables() {
        int localVariable = 20;
        System.out.println("Global variable inside the method: " + globalVariable);
        System.out.println("Local variable inside the method: " + localVariable);
    }

    public void anotherMethod() {
        System.out.println("Global variable in another method: " + globalVariable);
    }

    public static void main(String[] args) {
        VariableAccessExample example = new VariableAccessExample();
        example.accessVariables();
        example.anotherMethod();
    }
}
