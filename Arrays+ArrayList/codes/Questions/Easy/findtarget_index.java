import java.util.ArrayList;

class INDEXER {   ////// use of array of object
    private int row,column;

    INDEXER(int row,int column){
        this.row=row;
        this.column=column;
        
    }

    void shower(){
        System.out.println(row+" "+column);
    }

}

public class findtarget_index {

    public static void main(String[] args) {
        

        ArrayList<INDEXER> obj = new ArrayList<>();  // The declaration ArrayList<INDEXER> obj = new ArrayList<>(); means that the ArrayList named obj is specifically designed to hold only objects of the INDEXER class.

        
        int target = 30;

        int arr[][] = {
            {5, 10, 15},
            {10, 25, 30}
        };



        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {

                    if(arr[i][j]==target){
                        obj.add(new INDEXER(i, j)); //  new INDEXER(i, j) creates a new instance of the INDEXER class, initializing it with the current row and column indices where the target value was found in the 2D array.

                    }





            }
        }

       
       for (INDEXER index : obj) {
         index.shower();
 
       }

    }
    
}
