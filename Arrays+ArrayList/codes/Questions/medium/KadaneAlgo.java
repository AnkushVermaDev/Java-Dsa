public class KadaneAlgo {
    public static void main(String args[]) {
        int arr[] = {1, 4, 5, 6, -2, -1, 0};

        int Prev_totalsum = arr[0];
        int currentMax = arr[0];

        for (int i = 1; i < arr.length; i++) {
            
            // Check if current element is consecutive to the previous one
            if (arr[i - 1] + 1 == arr[i]) {

                Prev_totalsum += arr[i]; // Add to the current subarray sum

            } 
            
            else {
                // Update currentMax if Prev_totalsum is larger
                currentMax = Math.max(currentMax, Prev_totalsum);
                // Reset Prev_totalsum to the current element
                Prev_totalsum = arr[i];
            }

        }

        // Final comparison to include the last subarray
        
        // currentMax = Math.max(currentMax, Prev_totalsum);

        System.out.println(currentMax); // Output the maximum sum
    }
}
