class Boss {
    public void bossWork() {
        for (int i = 1; i <= 100; i++) {
            System.out.println("Boss: " + i + " " + Thread.currentThread().getName());
        }
    }
}

class A extends Boss implements Runnable {
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++) {
            System.out.println(i + " " + Thread.currentThread().getName());
        }
    }
}

public class RunnableThread {
    public static void main(String[] args) {
        Boss bossObj = new Boss();
       

        // Creating and starting Thread 1 using Runnable
        A obj1 = new A();
        Thread th1 = new Thread(obj1, "::thread-1");
        
        obj1.bossWork();  // executing the parent class function 

        th1.start();  // executing the thread of its own class

        // Creating and starting Thread 2 using Runnable
        A obj2 = new A();
        Thread th2 = new Thread(obj2, "::thread-2");
        th2.start();
    }
}
