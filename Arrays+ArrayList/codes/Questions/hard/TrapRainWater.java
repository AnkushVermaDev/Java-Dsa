public class TrapRainWater {
    public static void main(String[] args) {
       
        int arr[]={2,100,5,9};
        int totalwater=0;

        int left_index = 0;
        int LeftMax_value = arr[left_index];

        int right_index=  arr.length - 1 ;
        int RightMax_value= arr[right_index];
    
        while (left_index < right_index) {

            if(arr[left_index]<arr[right_index]){

                left_index++;

                LeftMax_value = Math.max(LeftMax_value,arr[left_index]);

                totalwater += (LeftMax_value-arr[left_index]);                
            }

            else{
                right_index--;

                RightMax_value = Math.max(RightMax_value,arr[right_index]);

                totalwater += (RightMax_value-arr[right_index]);               

            }               
        }

        System.out.println(totalwater);
    }

   }
