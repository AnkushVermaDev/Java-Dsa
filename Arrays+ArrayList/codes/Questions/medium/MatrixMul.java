public class MatrixMul {


    public static void main(String[] args) {


        int arr[][]={ 

            {1,2},{4,5}
        };

        int arr2[][]={ 

            {1,2},{4,5}
        };
        
        int arr3[][] = new int[arr.length][arr2.length];


        for (int i = 0; i < arr.length; i++) { // its telling how many rows are there in our array

            for (int j = 0; j < arr[0].length; j++) { // its telling how many column are there for particular row
                    
                arr3[i][j]=0;
                for (int k = 0; k < arr[0].length; k++) { // its telling how many column are there for particular row


                    arr3[i][j] += arr[i][k]*arr2[k][j];
                    
                    

                }
            }
            
        }

        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
        }

    }
    
}
