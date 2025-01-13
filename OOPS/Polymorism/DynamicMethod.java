/*
 
Dynamic Method Dispatch (also known as runtime polymorphism) is a mechanism in Java that resolves method calls at runtime rather than compile time. 
It is the process through which the method that is invoked is determined based on the object type (rather than the reference type) at runtime.


*/



public class DynamicMethod {

    static class father{
        void greeting(){
            System.out.println("Good morning from father");
        }
    }


   static class child extends father{
        
        @Override

         void greeting(){
            System.out.println("Good morning from Child");
        }
    }

    static class adoptedchild extends father{
        
        @Override

         void greeting(){
            System.out.println("Good morning from adoptedchild");
        }
    }



    public static void main(String[] args) {
        
        child bacha  = new child();
        adoptedchild bacha2 = new adoptedchild();



        father baap = bacha2; // using father class we are able able to point to another class method 
        
        baap.greeting();
       



    }
    
}
