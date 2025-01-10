import java.util.*;
public class Main {
	
	public static int[] index(int left, int right,int[] arr)
  {
   
   for(int i=0;i<arr.length;i++){
   
    if(arr[i]==left){
    
      left = i;
    
          }
     else if(arr[i]==right){
    
      right = i;

        }
   
   }
   
   return new int[] {left ,right};
   
   } 
	
	
	
	
	
	
	
	public static void main(String[] args) {
		
		
		
		int[] originalArray = {5, 3, 8, 6, 2};

        // Copy the original array
        int[] sortedArray = originalArray.clone();

        // Sort the copied array
        Arrays.sort(sortedArray);
        
        
        
        int left=0;
        int target=10;
        int right=originalArray.length-1;
        while(left<right){
        	
        	if((sortedArray[left] + sortedArray[right]) ==target){
        		System.out.println("got it");
        		
        	int[] result =	index( sortedArray[left], sortedArray[right],originalArray);
        	System.out.println(result[0] + " " + result[1]);

        	
        		break;
        		
        		}
        		
        		
        	else	if((sortedArray[left] + sortedArray[right]) > target){
        		
        		right--;
        		
        		}
        		
        		
        		else	if((sortedArray[left] + sortedArray[right])<  target){
        		
        		left++;
        		
        		}
        		
        		
        		
        	
        	
        }
        
	}
}
