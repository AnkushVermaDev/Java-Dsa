public class BuySellStock_1 {

   public static void main(String[] args) {
    
/*

> after buying of stock on particular day we cannot sell in past. we can also go forward

> after buying of stock we will think each day after buying stock day as oppurtunity of selling it

> there for in loop with each iteration we will substract buying price with next rates after its purchase using : 
    int profit = arr[i] - buy_price;


> if our profit is greater than initally declare variable maxprofit which is initally 0 then:
    maxprofit = profit;



*/

    int arr[]={7,5,3,2,10};

    try {
        if (arr.length < 2) {
            System.out.println("No profit");
        }

        int buy_price = arr[0]; // Start with the first price as the buy price
        int maxprofit = 0;      // Initialize max profit to 0

        // Loop through the array to find the max profit
        for (int i = 1; i < arr.length; i++) {
            // Calculate profit by selling at the current price
            int profit = arr[i] - buy_price;

            // Update max profit if the current profit is greater
            if (profit > maxprofit) {
                maxprofit = profit;
            }

            // Update buy price if the current price arr[i] is lower
            if (arr[i] < buy_price) {
                buy_price = arr[i]; // assign lowest buy price
            }
        } // end of loop

        // Print the maximum profit
        if(maxprofit>0){
            System.out.println("Max profit earned is : "+maxprofit);
        }

        else{

            System.out.println("No Profit earned");

        }

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(e);
    }


   }
    
}
