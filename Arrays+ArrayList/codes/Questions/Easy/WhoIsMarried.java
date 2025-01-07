import java.util.ArrayList;

public class WhoIsMarried{



public static void main(String[] args) {
    

int arr[]={1,2,3,3,5,6};


ArrayList<Integer> mylist = new ArrayList<>();






for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {

        if (arr[i]==arr[j]) {

            mylist.add(arr[i]);

        } 
        
    }
}


for (Integer integer : mylist) {
   
    System.out.println(integer);
    
}



}

}
