public class BuySellStock2 {

    public static void main(String[] args) {

        /*
         * 
         * CONTEXT: Best Time to Buy and Sell Stock II
         * 
         * The PRICES array contains stock prices, where each index represents the price
         * of the stock on a particular day.
         * 
         * RULES:
         
         * 1. You can hold only one stock at a time.
         * 2. You must sell the previously purchased stock before buying another.
         * 3. You are allowed to buy and sell stocks multiple times, even on the same
         
         * GOAL:
         * 
         * Find total profit / loss by summing up the profit/loss from each transaction.
      
         */

        int prices[] = { 7, 1, 5, 3, 6, 4};  



        int max_profit1 = 0;


        for (int i = 1; i < prices.length ; i++) {
            
            if(prices[i]> prices[i-1]){   // if selling rate is bigger than than previus buy rate then we got profit for single trade
                max_profit1 += prices[i] - prices[i-1];
            }

        }
        
        System.out.println(max_profit1);

    }

}
