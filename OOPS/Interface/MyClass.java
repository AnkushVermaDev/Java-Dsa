public class MyClass implements PublicInterface, PackagePrivateInterface {

    // Implementing the abstract method
    @Override
    public void abstractMethod() {
        System.out.println("Implemented abstract method.");
    }

    // Overriding the default method from PublicInterface
    @Override
    public void defaultMethod() {
        System.out.println("Overridden default method.");
    }

    // Implementing method from PackagePrivateInterface
    @Override
    public void method() {
        System.out.println("Implemented method from PackagePrivateInterface.");
    }
}
