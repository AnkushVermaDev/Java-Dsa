import java.util.ArrayList;
import java.util.Arrays;

/*

    Program Purpose:

    This program performs the following steps:


    1. **Odd and Even Separation**:
       - Finds all odd numbers from the input array and places them into an ArrayList.
       - Then, appends all even numbers to the same ArrayList after the odd numbers.

    2. **Sorting**:
       - Sorts the entire ArrayList in ascending order.

    3. **Pairing Logic**:
       - Pairs the smallest odd number (from the start of the list) with the largest even number (from the end of the list).
       - Computes the sum of each pair.

    4. **Result Calculation**:
       - Adds the resulting sums into a new list for clarity.
       - Finds the maximum value from this list and prints it.

    5. **Edge Case Handling**:
       - If there are no odd numbers or no even numbers, the program returns `0`.
       - A return value of `0` indicates that no valid pairs can be formed.


example 

// 1,2,4,8,3,5

sort them:

//  odd : [1, 3, 5])  Even: ([2, 8, 4]).

Odd    Even          result
1    + 4      =      5
3    + 8      =      11
5    + 2      =      7

biggest answer is in above expample is 11

   
*/

public class MinimizeMaxPairSum {

    static int checker() {
        int arr[] = { 1, 3, 10, 12, 5, 23, 6 ,2}; // [1, 3, 5]) and evens ([2, 8, 4]).
        ArrayList<Integer> myval = new ArrayList<>();
        ArrayList<Integer> maxcalc = new ArrayList<>();

        Arrays.sort(arr);

        for (int num : arr) {

            if (num % 2 != 0) {

                myval.add(num); // Add odd numbers first

            }

        }

        int LowerBound_Index = (myval.size()) - 1;
        if (myval.isEmpty()) {
            return 0;
        }

        for (int num : arr) {

            if (num % 2 == 0) {

                myval.add(num); // Add even numbers next

            }

        }

        if (LowerBound_Index == myval.size()) {

            return 0;

        }

        int target = 0;
        int UpperBound_Index = (myval.size()) - 1;


        try {
            
        for (int i = 0; i <= LowerBound_Index; i++) {

            target = myval.get(i) + myval.get(UpperBound_Index);
            maxcalc.add(target);
            UpperBound_Index--;

        }

        int inital_value = maxcalc.get(0);
        for (Integer integer : maxcalc) {

            if (inital_value < integer) {

                inital_value = integer;

            }

        }

        maxcalc.clear();
        maxcalc.add(inital_value);
        System.out.println(maxcalc);
        return 1;

    } 


    catch(Exception e){
        System.out.println(e.getMessage());
        return 0;
    }

    }

    public static void main(String[] args) {

        checker();

    }

}
