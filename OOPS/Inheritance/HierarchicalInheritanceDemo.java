// In hierarchical inheritance, multiple child classes inherit from a single parent class. Below is an example of hierarchical inheritance in Java.



// Parent class
class Animal {
    void eat() {
        System.out.println("This animal can eat.");
    }
}

// Child class 1
class Dog extends Animal {
    void bark() {
        System.out.println("This dog can bark.");
    }
}

// Child class 2
class Cat extends Animal {
    void meow() {
        System.out.println("This cat can meow.");
    }
}

// Main class
public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();
        dog.eat();  // Inherited method from the Animal class
        dog.bark(); // Method of the Dog class

        // Create an object of the Cat class
        Cat cat = new Cat();
        cat.eat();  // Inherited method from the Animal class
        cat.meow(); // Method of the Cat class
    }
}
