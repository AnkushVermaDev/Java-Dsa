import java.util.ArrayList;

public class RearrangeSign {

    public static void main(String[] args) {
        int arr[] = {1, 2, -3, 5, -8, -10};
        int arr2[] = new int[arr.length];

        int posIndex = 0; // Tracks index for positives
        int negIndex = 1; // Tracks index for negatives

        for (int num : arr) {
            if (num > 0) {
                if (posIndex < arr.length) {
                    arr2[posIndex] = num;
                    posIndex += 2; // Increment by 2 for alternation
                }

            } 
            
            else {

                if (negIndex < arr.length) {
                    arr2[negIndex] = num;
                    negIndex += 2; // Increment by 2 for alternation
                }
                
            }
        }

        // Print the rearranged array
        for (int element : arr2) {
            System.out.println(element);
        }
    }
}
