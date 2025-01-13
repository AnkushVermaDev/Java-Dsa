//   Java does not support multiple inheritance with classes directly because it can lead to ambiguity. However, Java achieves multiple inheritance using 
//   interfaces. An interface in Java allows a class to inherit from multiple sources.


// Use an interface when you want to ensure that a set of methods must be implemented by any class that implements the interface.
// Allow Multiple Classes to Share a Common Behavior: >  When multiple unrelated classes share a common behavior, an interface is a great way to enforce this.

// First interface
interface Animal {
    void eat();
}

// Second interface
interface Pet {
    void play();
}

// A class implementing both interfaces
class Dog implements Animal, Pet {
    // Implement methods from Animal interface
    public void eat() {
        System.out.println("This dog can eat.");
    }

    // Implement methods from Pet interface
    public void play() {
        System.out.println("This dog loves to play.");
    }
}

// Main class
public class MultipleInheritanceDemo {
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Access methods from both interfaces
        dog.eat();  // Method from the Animal interface
        dog.play(); // Method from the Pet interface
    }
}
