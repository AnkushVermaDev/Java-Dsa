public class FindSmall_Great {

    public static void main(String[] args) {
        int arr[] = {2,5,2,6,189};




        int holder = arr[0];
        int bigger = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if(holder>arr[i]){ // agar holder me jo value of agar woh baade hai  arr[i] se to uski value holder me daalo taki choti value mil sake

                holder =   arr[i]; // smallest value provided to holder
            }

            else{
                bigger = arr[i];  // providing bigger value into variable
            }

        }


        System.out.println(holder);
        System.out.println(bigger);

    }
    
}
