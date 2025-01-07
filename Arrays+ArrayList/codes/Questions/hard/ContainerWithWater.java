public class ContainerWithWater {

    public static void main(String args[]){


        int arr[]={1,8,6,2,5};

        int left_index = 0;
        int right_index = arr.length - 1;
        int water_capac = 0;

        while (left_index < right_index) {
            int barheight = Math.min(arr[left_index], arr[right_index]);
            int width = right_index - left_index;
            int area = width * barheight;

            water_capac = Math.max(water_capac, area);

            if (arr[left_index] < arr[right_index]) {
                left_index++; // Move the left pointer to the right
            }

            else {

                right_index--; // Move the right pointer to the left
                
            }
        }

        System.out.println(water_capac);



    }
    
}
