public class DaemonThread {

    static class Parent extends Thread {
        private volatile boolean isWorking = false; // Flag to indicate if the thread is working

        public void run() {
            isWorking = true; // Set the flag to true when the thread starts working
            try {
                System.out.println("Daemon thread started working.");
                Thread.sleep(2000); // Simulate work by sleeping for 5 seconds
                System.out.println("Daemon thread finished working.");
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                isWorking = false; // Set the flag to false when the thread finishes
            }

            // Check if the current thread is a daemon
            if (Thread.currentThread().isDaemon()) {
                System.out.println("Child called which is a daemon");
            } else {
                System.out.println("Child called which is not a daemon");
            }
        }

        public boolean isWorking() {
            return isWorking; // Method to check if the thread is working
        }
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main thread starting");

        Parent obj = new Parent(); // Create an instance of the Parent thread
        obj.setDaemon(true); // Set the thread as a daemon
        obj.start(); // Start the daemon thread

        

        // Wait for a short time to allow the daemon thread to finish
        obj.join(3000); // Wait for 2 seconds for the daemon thread to finish

        System.out.println("Main thread is terminating or finished successfully");
    }
}

