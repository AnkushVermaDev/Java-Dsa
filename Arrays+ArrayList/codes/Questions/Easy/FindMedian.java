import java.util.Arrays;

public class FindMedian {

    public static void main(String[] args) {
      
        
        int arr[] = {1,2,3,6};
        float result  = 0;
        int n = arr.length;
        // NOTE WE HAVE TO PUT THE FORMAULA ON THE VALUES NOT ON THE INDEXS ; TO FIND OUT THE MEDIANS

        // note for 'even' value we have to do +1  and for odd value we have to do -1 in formula
        
        if(arr.length%2==0){
            result = (arr[ (n/2)-1 ] + arr[n/2])/2.0f;
            System.out.println(result);
        }

        else{
            result = (arr[(n+1)/2]);
            System.out.println(result);
        }



      
    }
    
}
