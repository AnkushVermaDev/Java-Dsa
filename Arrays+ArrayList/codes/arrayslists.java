import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
public class arrayslists {

    /*
     *    add()
     *    remove() 
     *    removeIf( Listvariable -> Listvariable.startsWith(" x ") ) 
     *    set() 
     *    get()
     *    toArray() 
     *    contains()
     *    isEmpty()
     *    subList() 
     *    addAll
     *    clear()
     *    indexOf()
     *    lastIndexOf() 
     *    size()
   
     */
    public static void main(String[] args) {
        

        ArrayList<Integer> alst = new ArrayList<>();

        
        alst.add(1);     // add new value 
        
        alst.add(12);    // again add new value 

        alst.add(5);     // add new value 

        alst.add(45);     // add new value 

        alst.add(0);     // add new value 

        System.out.println("before full list : "+alst);
        
        alst.remove(3); // remove the item at index 0

        System.out.println("after removing the index 3 value : "+alst);

        

        System.out.println("the item at index 3 is : "+alst.get(0)); //  RETRIVE THE VALUE WHICH IS AT INDEX 0


        alst.set(1, 99); // Set the value at index 1 to 99
        
        System.out.println("List after setting index 1 to 99: " + alst);



        
        System.out.println("the total size of arraylist is: "+alst.size());  //  FIND THE TOTAL NUMBER ITEMS IN THE ARRAY-LIST
        
        System.out.println("is value 1 contain in arraylist ? : "+alst.contains(1)); // find where specific item available in our array
        
        System.out.println("is my arraylist empty ? : "+alst.isEmpty());  // find is our arraylist empty or not

       
        Object[] arr =  alst.toArray();   // converting the arraylist to array

        System.out.println("CONVERTED LIST TO ARRAY STRING: "+Arrays.toString(arr));


        alst.sort(Comparator.naturalOrder()); // or we can use reverseOrder() to sort the arraylist in reverse order


        System.out.println("LIST AFTER SORTING IN ASSENDING ORDER: "+alst);

        alst.sort(Comparator.reverseOrder()); 
        System.out.println("LIST AFTER SORTING IN DECENDING ORDER: "+alst);

        ArrayList<Integer> clonedList = new ArrayList<Integer>();

          clonedList.addAll(alst);
          System.out.println("we have cloned whole list into anotehr list: "+clonedList);


          clonedList.clear();
          System.out.println("After clearing the whole list: "+clonedList);


           List<Integer>  container = alst.subList(0, 2);   // 0 to n-1
           System.out.println("extracted sublist: "+container);


           System.out.println("index of value of 12 : "+alst.indexOf(99));  // find the first occurance of specific value in the list
           System.out.println("index of value of 12 : "+alst.lastIndexOf(1));  // find the last occurance of specific value in the list



           ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Orange","Banana"));

           fruits.removeIf(fruit -> fruit.startsWith("B"));

           System.out.println("removed the value from list that was starting with aplabet 'b': "+fruits); // Output: [Apple, Orange]

   

    }
    
}
