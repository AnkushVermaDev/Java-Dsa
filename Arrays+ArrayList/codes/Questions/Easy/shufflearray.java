class shuffler{
    int[] shower(int[] arr){

        // Loop through the array and swap adjacent elements
        for (int i = 0; i < arr.length - 1; i++) {
            // Swap elements
            int temp = arr[i];
            arr[i] = arr[i + 1];
            arr[i + 1] = temp;

        }

        // Print the contents of the holder
        System.out.println("");
        // Print the final state of the array
        for (int num : arr) {
            System.out.print(num + " ");
        }

        return arr;

    }
}
public class shufflearray {
    public static void main(String[] args) {
        
        // One-dimensional array
        int[] arr = {1, 2, 3, 4, 5};

        for(int i =0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }


        shuffler obj = new shuffler();
        arr = obj.shower(arr);

        arr = obj.shower(arr);



        
    }
}