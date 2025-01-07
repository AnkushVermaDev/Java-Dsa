public class MergeArr {

    public static void main(String[] args) {
        

        int nums1[] = new int[]{1,2,9,3};

        int nums2[] = new int[]{4,5,6};


        int newarray[] = new int[(nums1.length + nums2.length)];
        int counter=0;

        for(int i = 0;i<2;i++){
            if(i==0){

                for (int j = 0; j < nums1.length; j++) {

                    newarray[counter] = nums1[j];
                    counter++;
                }
            }

            else{

                for (int k = 0; k < nums2.length; k++) {

                    newarray[counter] = nums2[k];
                    counter++;
                }

            }
        }

        for (int i = 0; i < newarray.length; i++) {
            System.out.printf("%d ",newarray[i]);

        }
    }
    
}
