abstract class Animal {
    // Private field - cannot be accessed outside the class directly
    private String name;

    // Protected method - can be accessed in the same package or by subclasses
    protected void setName(String name) {
        this.name = name;
    }

    // Public method - accessible from anywhere
    public String getName() {
        return name;
    }

    // Abstract method - subclasses must provide an implementation
    abstract void sound();

    // Concrete method - implemented in the abstract class
    public void eat() {
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal {
    // Implementing the abstract method from Animal class
    @Override
    public void sound() {
        System.out.println("The dog barks.");
    }

    // Calling the protected method from the parent class
    public void setDogName(String name) {
        setName(name); // Accessing the protected method from the parent class
    }
}

class Main {
    public static void main(String[] args) {
        // Cannot instantiate the abstract class Animal
        // Animal animal = new Animal(); // Error

        // You can instantiate a subclass
        Dog dog = new Dog();
        dog.setDogName("Buddy");
        System.out.println("Dog name: " + dog.getName()); // Output: Dog name: Buddy
        dog.sound(); // Output: The dog barks.
        dog.eat();   // Output: This animal eats food.
    }
}
