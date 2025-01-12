            ////////////////////////////////////////////////   CLASS //////////////////////////


A class is a blueprint or template for creating objects. It defines the properties (fields/attributes) and behaviors (methods) that the objects created from the class will have


Real-World Analogy for a Class:
        Imagine you're designing a blueprint for a house. The blueprint specifies:-
         (1) How many rooms the house will have.
         (2) The materials to be used.
         (3) The layout of the rooms.
         (4) But this blueprint is not an actual house. It's just a plan. You can use it to build actual houses.



                   /////////////////////////////////////   OBJECT ///////////////////////////


An object is an instance of a class. It is a real-world entity that is created using the class blueprint. Each object has its own copy of attributes and methods defined by the class



LIKE: THERE IS CLASS NAME AS "STUDENT"  AND AS WE KNOW IN CLASS THERE WILL BE LOT OF STUDENTS AND EACH STUDENT HAS DIFFERENT:-  NAME , AGE , BEHAVIOUR 
      SO WE CAN CREATE CLASS OF STUDENT WITH ATTRIBUTE AND FUNCTIONS:>   NAME , AGE , BEHAVIOUR 

AFTER WE CAN CREATE OBJECT OF THAT CLASS AND EACH OBJECT CAN HAVE DIFFERENT VALUE THAT REPRESENT DATA FOR THAT STUDENT


///////////////////////////////////////////////////   ABSTRACTION   ////////////////////

Think of abstraction as simplifying complex systems by hiding unnecessary details. It helps in reducing complexity and improving code maintenance.

Real-World Analogy
    Imagine you drive a car. You only care about how to operate the car (press the accelerator, use the brakes, steer). You don't need to know how the engine works internally. The car's internal workings are abstracted from you. You just interact with the essential controls.

Key Points About Abstraction:
    Abstract classes: These classes can have both abstract methods (methods without implementation) and concrete methods (methods with implementation). The abstract methods must be implemented by the derived (sub) classes.
    


          /////////////////////////////////////////     ENCAPSULATION  ///////////////////////////////


Definition: 

    Encapsulation is the process of hiding the internal details of an object and restricting access to them by using access modifiers like private,protected, and public. It ensures that the internal state of an object can only be changed through specific methods, known as getters and setters.
    Encapsulation promotes data security, ensures control over data, and supports the principle of data hiding.

Real-World Analogy:

        Think of a Capsule.
        A capsule contains medicine inside, but you can't access the medicine directly; it's enclosed within the outer shell. You can only consume the capsule as a whole, without knowing how the medicine is stored inside.


Key Points About Encapsulation:

        Private fields: Fields of a class are declared private to restrict direct access.
        Public methods (getters/setters): Methods are provided to allow controlled access to the private fields.
        It ensures data integrity and prevents unintended interference with the object's internal state.



                    ///////////////////////////   POLYMORISM ///////////////////////////


Polymorphism means "many forms". It allows one entity (like a method or object) to take on multiple forms. Polymorphism enables objects to behave differently based on their context, improving flexibility and reusability in code.

In Java, polymorphism is mainly achieved through method overloading (compile-time polymorphism) and method overriding (runtime polymorphism).

              //////////////////////////////////////////// TYPES ////////////////////////

Compile-Time Polymorphism (Method Overloading):

    Method overloading allows a class to have multiple methods with the same name but different parameters (number or type). The compiler decides which method to call based on the arguments at compile time.

Runtime Polymorphism (Method Overriding):

        Method overriding occurs when a subclass provides a specific implementation for a method that is already defined in its parent class. The method to be called is determined at runtime, based on the type of the object.    
