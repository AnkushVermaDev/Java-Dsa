public class LonelyArr {

    public static void main(String[] args) {

        int arr[] = {1, 1, 3, 5, 3};
        int virgin_boy[] = new int[arr.length];  // Array to store lonely elements
        int resultIndex = 0;  // Index to store lonely elements

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            // Count how many times arr[i] appears in the array
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }

            // If the count is 1, the element is lonely
            if (count == 1) {
                virgin_boy[resultIndex] = arr[i];  // Store lonely element
                resultIndex++;  // Move to the next position for lonely elements
            }
        }

        // Print the lonely elements from the virgin_boy array
        System.out.println("Lonely elements:");
        for (int i = 0; i < resultIndex; i++) {
            System.out.println(virgin_boy[i]);  // Print only the lonely elements
        }
    }
}
