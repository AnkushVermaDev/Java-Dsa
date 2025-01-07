public class arrays{
    public static void main(String[] args) {
        

        // one dimensinal array
        System.out.println("\n\n/////////////////////  1D ARRAY //////////////////\n");


        int [] arr ;
        arr = new int[]{1,2,3,5};

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ",arr[i]);
        }


System.out.println("\n\n/////////////////////  2D ARRAY //////////////////\n");


//  Outer loop typically represents the Row, while the Inner loop represents the Columns. 

// we will print same format as i shown in example in picture format for 2d array



        int arr2[][] = {{2,10,15},{20,25,30},{35,40,45}};


        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                System.out.printf("%d ",arr2[i][j]);
            }
            System.out.println("");
        }


System.out.println("\n/////////////////////  Jagged  ARRAY //////////////////\n");


int jugger[][] = new int[3][]; // in jagged array we have set only row as we have array in future that will have the row as 3 but column values can be anything


jugger[0] = new int[]{5, 10, 15};   // now we are saying that for first row of our array we will have 3 columns


jugger[1] = new int[]{20, 25, 30, 35};   // now we are saying that for second row of our array we will have 3 columns


jugger[2]= new int[]{40,45} ;   // now we are saying that for first row of our array we will have 3 columns


for (int i = 0; i < jugger.length; i++) {
    for (int j = 0; j < jugger[i].length; j++) {
        System.out.printf("%d ",jugger[i][j]);
    }
    System.out.println("");
}



System.out.println("/////////////////////  3D ARRAY //////////////////\n");




int arr3d[][][] ={
   { {1,2,3},{4,5,6} ,{7,8,9}  },
              

    {   {10,11,12},{13,14,15},{16,17,18}    }



};


for (int j = 0; j < arr3d.length; j++) {  // arr3d.length = 2     .   because we want 2 table of 2d arrays

    for (int j2 = 0; j2 < arr3d[j].length; j2++) {   // arr3d[j].length =  tells row in table
        for (int k = 0; k < arr3d[j][j2].length; k++) {   // arr3d[j].length =  tells columns in table

            System.out.printf("%d ",arr3d[j][j2][k]);
            
        }
        System.out.println("");
    }
    System.out.println("");
    
}



    }

}