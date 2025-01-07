public class SumofRow {

    public static void main(String[] args) {
        

        // we are gonna add the 2nd row elements

        int arr[][]= {{1,2,3},    
                      {4,5,6},
                      {7,8,9}};



        int sum=0;   
        int fixedrow=1;                

        // Iterate over elements of the fixed row

        for (int i = 0; i < arr[fixedrow].length; i++) { 

            sum += arr[fixedrow][i];
            
        }        
        
        
        System.out.println(sum);


    }
    
}
