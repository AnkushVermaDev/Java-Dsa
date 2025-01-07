public class OddEven {

    
    public static void main(String args[]){

        int arr[]={2,3,5,14};

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
