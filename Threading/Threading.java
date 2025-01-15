class A extends Thread{
   static int counter1=0; 
   public void run(){

    for (int i = 0; i < 100; i++) {
        System.out.println("hello from A: " + counter1++);
        System.out.println("The current thread name is: " + Thread.currentThread().getName());  

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) { // it will run in last because he JVM relies on the operating system's thread scheduler, which can use different algorithms (e.g., round-robin, priority-based scheduling). On some systems, threads with sleep() calls might be de-prioritized until they wake up.
            e.printStackTrace();
        }

     }

    }
    
}    

class B extends Thread {
   static int counter2=0; 

    public void run(){

        for (int i = 0; i < 100; i++) {  
           System.out.println("hello from B: "+counter2++);
           System.out.println("The current thread name is: " + Thread.currentThread().getName());  
        }    
    }
    
}    


class E extends Thread {
    static int counter3=0; 
 
     public void run(){
 
         for (int i = 0; i < 100; i++) {  
            System.out.println("hello from E : "+counter3++);
         }    
     }
     
 }    

public class Threading{


 public static void main(String[] args) throws InterruptedException {
    
    A obj = new A();
    B obj2 = new B();
    E obj3 = new E();


    obj.start();
    obj.setName("Threading 1");
    obj.join(2000);


    obj2.setName("Threading 2");
    obj2.start();


    obj3.setName("Threading 3");
    obj3.start();
    obj3.setPriority(9); // setting maxprority


   }


 }