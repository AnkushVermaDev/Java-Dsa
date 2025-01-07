public class PrintSubArr {

    public static void main(String[] args) {
        
        int arr[] = {1, 2, 3};

        // Loop through all possible starting points of subarrays
        for (int i = 0; i < arr.length; i++) {
            
            // For each starting point, loop through all possible ending points
            for (int j = i; j < arr.length; j++) {
                
                // Print the current subarray directly without inner loop
                System.out.print("[ ");
                for (int k = i; k <= j; k++) {
                    System.out.print(arr[k] + " ");
                }
                System.out.println("]");
            }
        }
    }
}
