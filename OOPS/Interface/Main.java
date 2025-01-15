public class Main {
    public static void main(String[] args) {
        // Testing the public interface
        
        PublicInterface obj = new MyClass();
        obj.abstractMethod(); // Output: Implemented abstract method.
        obj.defaultMethod();  // Output: Overridden default method.
        PublicInterface.staticMethod(); // Output: This is a static method.
        obj.callPrivateHelper(); // Output: This is a private helper method.

        // Accessing the constant
        System.out.println("CONSTANT: " + PublicInterface.CONSTANT); // Output: CONSTANT: 100

        // Testing the package-private interface
        PackagePrivateInterface packagePrivateObj = new MyClass();
        packagePrivateObj.methodWithDefault();  // Output: Package-private interface default method.
        PackagePrivateInterface.staticMethod(); // Output: Static method in package-private interface.
    }
}
