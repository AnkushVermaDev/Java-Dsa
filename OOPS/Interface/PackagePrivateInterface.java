interface PackagePrivateInterface {

    // Abstract method (implicitly public)
    void method();

    // Default method (implicitly public)
    default void methodWithDefault() {
        System.out.println("Package-private interface default method.");
    }

    // Static method (implicitly public)
    static void staticMethod() {
        System.out.println("Static method in package-private interface.");
    }
}
