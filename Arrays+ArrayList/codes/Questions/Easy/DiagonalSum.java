public class DiagonalSum {

    public static void main(String[] args) {
        
        int arr[][] = {{1,2,3},
                       {4,5,6},
                       {7,8,9}}; 


                       // here diagonla elements are:  1 + 5 + 9 := 15 result
        int sum=0;


        for (int i = 0; i < arr.length; i++) {

            sum += arr[i][i]; // Add the diagonal element
            
        }     

        System.out.println("sum of diagonla array is: "+sum);

    }
    
}
