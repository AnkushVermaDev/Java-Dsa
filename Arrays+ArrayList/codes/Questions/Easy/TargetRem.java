import java.util.ArrayList;

public class TargetRem{

    public static void main(String[] args) {
        

        int arr[]= {1,2,3,2,5,7,1,1,1};
        int newarr[]=new int[arr.length];
        ArrayList<Integer> myarrList = new ArrayList<>();
        int target  = 1;
        
        for(int i =1;i<arr.length;i++){

            if(arr[i]==target){
                
                continue;
            }
            else{
                myarrList.add(arr[i]);
            }
        }

        for (int i : myarrList) {
            System.out.println(i);
            
        }
    }
}