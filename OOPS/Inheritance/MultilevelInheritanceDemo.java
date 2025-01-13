// Multilevel inheritance in Java occurs when a class inherits from a class that itself is a child of another class. This creates a chain of inheritance.


// Grandparent class
class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

// Parent class
class Mammal extends Animal {
    void walk() {
        System.out.println("This mammal can walk.");
    }
}

// Child class
class Dog extends Mammal {
    void bark() {
        System.out.println("This dog can bark.");
    }
}

// Main class
public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Access methods from all levels of inheritance
        dog.eat();  // Method from the Animal class
        dog.walk(); // Method from the Mammal class
        dog.bark(); // Method from the Dog class
    }
}
