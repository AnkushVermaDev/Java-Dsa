// . In single inheritance, a subclass inherits from a single parent class.  
  
  
  // Parent class
    class Animal {
        void eat() {
            System.out.println("This animal can eat.");
        }
    }
    
    // Child class
    class Dog extends Animal {
        void bark() {
            System.out.println("This dog can bark.");
        }
    }
    


public class SingleInheritance {


// Main class
    public static void main(String[] args) {
        // Create an object of the Dog class
        Dog dog = new Dog();

        // Access methods from both the parent and child classes
        dog.eat();  // Method from the parent class
        dog.bark(); // Method from the child class
    }
}

