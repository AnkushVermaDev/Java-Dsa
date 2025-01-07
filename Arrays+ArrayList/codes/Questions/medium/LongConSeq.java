import java.util.Arrays;

public class LongConSeq {


 public static   int maxfinder(int maxSequence, int currentSequence){

        return  maxSequence > currentSequence ? maxSequence:currentSequence;

    }
    public static void main(String[] args) {
        int arr[] = {1,0, 2,5,99}; // Example with duplicates

        Arrays.sort(arr); // Sort the array

        int minsequence = 1; // To track the longest sequence
        int currentSequence = 1; // To count the current sequence length
        int result = 0;

        // CUSTOM CODE TO FIND MAX VALUE:


        

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] == arr[i +1]) {
                // Skip duplicates
                continue;
            } else if (arr[i+1] == arr[i] + 1) {
                // Increment sequence length for consecutive numbers
                currentSequence++;
            } else {
                // Update the maximum sequence length and reset counter
                minsequence  = maxfinder(minsequence, currentSequence); // calling custom function to find max value
                currentSequence = 1;
            }
        }

        // Compare the last sequence length


        System.out.println("Longest Consecutive Sequence Length: " + minsequence);
    }
}
