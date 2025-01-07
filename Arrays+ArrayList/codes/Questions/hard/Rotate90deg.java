// Learned from "TAKE YOU FORWARD" : STRIVER


public class Rotate90deg {

    public static void main(String[] args) {
        




        int arr[][] = {{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

                       

        int rotetaor_arr[][] = new int[4][4];


        // LOGIC FOR ROTATION:

        for (int i = 0; i < arr.length; i++) { // THIS LOOP IS FOR ROW

            for (int j = 0; j < arr[i].length; j++) { // THIS LOOP IS FOR COLUMN
            
                   rotetaor_arr[j][(arr.length)-1-i]  =arr[i][j]; // SWAPPING IS DONE HERE


            }

        }


        System.out.println("------------------------------------------------------");


        System.out.println("Normal array\n");

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {

                System.out.printf("%d\t",arr[i][j]);
                
            }

            System.out.println();

        }

        System.out.println("------------------------------------------------------");


        System.out.println("Rotated array\n");


        for (int i = 0; i < rotetaor_arr.length; i++) {
            for (int j = 0; j < rotetaor_arr[i].length; j++) {

                System.out.printf("%d\t",rotetaor_arr[i][j]);
                
            }
            System.out.println();
        }
        
        System.out.println("------------------------------------------------------");

    }
    
}
