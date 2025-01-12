/**
 * 
 * This program demonstrates key OOP concepts in Java, including:
 * 1. Static methods
 * 2. Encapsulation and access specifiers
 * 3. Abstract classes and inheritance
 * 4. Method overriding
 * 5. Dynamic method dispatch
 
 */



/////////////////////////////////////////////////////////////////////////////////////////////




// in below code we can directly run() method without creating object of that class
//   static allows direct invocation of methods without an object.


class Demo_Static{

    static void run(){
        System.out.println("hello runner");
    }

}


/**
 * 
 * This class demonstrates the concept of encapsulation in Java,
 * specifically focusing on the protected access specifier.
 * 
 * The class contains a protected integer variable 'a' which can be accessed
 * by subclasses and classes in the same package. The 'shower' method
 * prints the value of 'a' to the console.
 
 */

class EncapsulationConceptSpecifier{

    private int a = 10;


    public void shower(){
        System.out.println(a);
    }

}


//      USE OF ABSTRACT CLASS 

abstract class animal{
    abstract void bark();

     void eat(){
        System.out.println("dog is eating food");
    }


}



class goldy_barar extends animal{ //  OUR CLASS NAME : goldy_barar is used this class has responsibility to give defination of abstract class  method()

    void bark(){
        System.out.println("mf dog is barking ");
    }

}


// USE OF METHOD OVER-RIDING

class father{
    void writing() {
        System.out.println("i am father and i write with left hand");
    }
}


class child extends father {

    @Override
    void writing(){
        System.out.println("i am child and i write with right hand");
    }
}

class child2 extends father{
    @Override
    void writing(){
        System.out.println("this nigga doesnot have any arms");
    }
}



// MAIN CODE EXECUTION STARTS

public class Object_Class {
    
public static void main(String[] args) {
    
    // static method demo
    Demo_Static.run();


    // encapsulation concept using protected access specifier

    EncapsulationConceptSpecifier obj = new EncapsulationConceptSpecifier();
    obj.shower();



    // abstract method demonstrate

    goldy_barar responsibility_taker = new goldy_barar();
    responsibility_taker.bark();
    responsibility_taker.eat();



   

    // USE OF METHOD OVER-RIDING
   
    father father_obj = new father();
    father_obj.writing();

    child child1 = new child();
    child1.writing();


    child2 child2_obj =  new child2();


    // DYNAMIC METHOD DISPATCH

    father_obj = child2_obj ;    // assign the memory of child2 object  to  parent class object 
    father_obj.writing();    // on this executon of statement using father class object we can call child class object

}
        

}