public class SeachSortedArr {


    public static void main(String[] args) {
        

        int arr[] = {1,2,3,4,5,6,7,8,10,15};

        int target = 199;
        
        // LINEAR SEARCH 

        boolean result_val = false;
        boolean result_val2 = false;


        System.out.println("WE ARE USING LINEAR SEARCH BELOW:> ");
        for (int i = 0; i < arr.length; i++) {
                if(arr[i]==target){
                    System.out.printf("\nwe found our target %d at index : %d\n",target,i);
                    result_val = true;
                    break;
                }

                
        }

        if(!result_val){
                System.out.println("sorry target not found in our array");
        }


        System.out.println("Binary searching technique:>");

        int least_sig = 0;
        int most_sig = arr.length;

        while (least_sig >=most_sig) {
            int mid =( least_sig + most_sig)/2;

            if(target == arr[mid]){
                System.out.println("we found our target number : "+target);
                result_val2 = true;
                break;
            }

            else if(target>arr[mid]){
                least_sig = mid+1;
            }

            else{
                most_sig = mid-1;
            }
            
        }


        if (!result_val2) {

            System.out.println("sorry our target is not found, we have use technique of binary search");
            
        }



    }
    
}
