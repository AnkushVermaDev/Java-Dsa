/*

Definition: Method overriding occurs when a subclass provides a specific implementation of a method that is already defined in its superclass.

 */


public class MethodOverRiding {

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

    public static void main(String[] args) {
        
        

        father baap = new father();
        baap.greeting();



        child bacha  = new child();
        bacha.greeting();



    }
    
}
