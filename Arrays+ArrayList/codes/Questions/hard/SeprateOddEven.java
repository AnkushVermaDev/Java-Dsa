public class SeprateOddEven {

    
    public static void main(String args[]){

        int arr[]={11,2,1,3,88,13,67,34};

        int left=0;

        int temp=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){

                temp = arr[i];
                arr[i] = arr[left];
                arr[left]=temp;
                left++;
            }
        }
        
        for(int i=0;i<arr.length;i++){

            System.out.println(arr[i]);
        }

    }

}
