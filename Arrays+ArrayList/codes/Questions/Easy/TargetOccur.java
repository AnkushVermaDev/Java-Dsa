public class TargetOccur {

    public static void main(String[] args) {
        


        int arr[] = {1,2,3,4,4,5,2,2};

        int target=2;
        int counter=0;

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target)
            {
                counter++;
            }
        }


        System.out.printf("\nOur target %d occurs total %d times\n",target,counter);

    }
    
}
