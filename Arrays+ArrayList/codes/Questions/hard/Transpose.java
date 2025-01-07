public class Transpose {

    public static void main(String[] args) {
        

        int arr[][]= {{1,2,3},    // here diagonal value :>  1 , 5 , 9 will keep unchanged
                      {4,5,6},
                      {7,8,9}};


        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) { // j = i+1 is used so that swapping is done on other elements rather than diagonals elements
                
               
                    int  temp = arr[i][j];
                    arr[i][j] = arr[j][i];
                    arr[j][i] = temp;
                
            }
        }


        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%d\t",arr[i][j]);
                
            }

            System.out.println();
        }

    }
    
}
