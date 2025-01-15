public interface PublicInterface {

    // Abstract method (implicitly public and abstract)
    void abstractMethod();

    // Default method (implicitly public)
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }

    // Static method (implicitly public)
    static void staticMethod() {
        System.out.println("This is a static method.");
    }

    // Private method (introduced in Java 9)
    private void privateHelper() {
        System.out.println("This is a private helper method.");
    }
    
    // Calling private method within the interface
    default void callPrivateHelper() {
        privateHelper();
    }

    // Constant field (implicitly public, static, final)
    int CONSTANT = 100;
}
