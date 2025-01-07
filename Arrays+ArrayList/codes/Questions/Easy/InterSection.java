import java.util.ArrayList;

public class InterSection {


    public static void main(String[] args) {
        

        int arr1[] = {1,2,3,4};
        int arr2[] = {6,20,3,45,4};


        ArrayList<Integer> commonvalue = new ArrayList<>();

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                
                if(arr1[i]==arr2[j]){

                    commonvalue.add(arr1[i]);

                }
            }
        }

        System.out.println(commonvalue);

    }
    
}
