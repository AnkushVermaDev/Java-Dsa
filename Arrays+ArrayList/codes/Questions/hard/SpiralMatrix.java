public class SpiralMatrix {

    public static void main(String[] args) {

        int arr[][] = {
            {1, 2, 3, 4},    
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int top = 0, left = 0;
        int bottom = arr.length - 1, right = arr[0].length - 1;

        System.out.println("Spiral Order Traversal:");
        while (top <= bottom && left <= right) {
            // Top row
            for (int i = left; i <= right; i++) {
                System.out.print(arr[top][i] + " ");
            }
            top++;

            // Right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(arr[i][right] + " ");
            }
            right--;

            // Bottom row (if still within bounds)
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            // Left column (if still within bounds)
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
        }
    }
}
