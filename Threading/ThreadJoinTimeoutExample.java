/* 
 
When you use the join(long millis) method with a specific timeout, you are essentially giving the calling thread a limited amount of time to wait for the thread 
being join()ed to complete its task. Here’s a clearer breakdown:

Behavior of join(long millis):
If the Thread Completes Within the Timeout:->

The calling thread remains in a waiting state until the thread being join()ed finishes its task.
Once the thread being join()ed completes, the calling thread resumes execution immediately.
If the Thread Does Not Complete Within the Timeout:

The calling thread stops waiting after the specified timeout and resumes execution.
The thread being join()ed does not terminate or stop; it continues running independently until it finishes.

*/


public class ThreadJoinTimeoutExample {
    public static void main(String[] args) {
        // A thread simulating a long-running task
        Thread longRunningThread = new Thread(() -> {
            try {
                Thread.sleep(5000); // Simulates 5 seconds of work
                System.out.println("Long-running thread finished.");
            } catch (InterruptedException e) {
                System.out.println("Long-running thread interrupted.");
            }
        });

        longRunningThread.start();

        try {
            System.out.println("Main thread waiting for 2 seconds...");
            longRunningThread.join(2000); // Main thread waits for 2 seconds
            System.out.println("Timeout expired or thread completed.");
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted.");
        }

        // Check if the long-running thread is still alive
        if (longRunningThread.isAlive()) {
            System.out.println("Long-running thread is still running...");
        } else {
            System.out.println("Long-running thread has finished.");
        }
    }
}
