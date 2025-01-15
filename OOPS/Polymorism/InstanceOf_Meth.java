public class InstanceOf_Meth {

    static class Checker {
        // You can add fields and methods here if needed
    }

    public static void main(String[] args) {
        
        int a = 78; // This is a primitive type
        Checker obj = new Checker(); // Use the corrected class name
        String str = "friday";

        // Check if obj is an instance of Checker
        System.out.println(obj instanceof Checker); // This will print true

        // Since 'a' is a primitive type, we cannot use instanceof on it.
        // Instead, we can check the type of 'a' by boxing it into an Integer.
        Integer boxedA = a; // Boxing the primitive int to Integer
        System.out.println(boxedA instanceof Integer); // This will print true
        System.out.println(str instanceof String); // This will print true
    }
}