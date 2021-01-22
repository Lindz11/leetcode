class Solution {
    public int maxProfit(int[] prices) {
        
        // Is there a way to look for both the min value to buy and the max profit at the same time
        int profit = 0; 
        int buy = Integer.MAX_VALUE; 
        for(int i = 0; i < prices.length; i++) {
            // Look for the min value that we can buy in at 
            buy = Math.min(prices[i], buy);
            // If that value is equal to the index we are at then continue 
            if(buy == prices[i])
                continue; 
            // If not then set that index to the new 
            if(prices[i] - buy > profit)
                profit = prices[i] - buy; 
        }
        
        return profit; 
    }
}
