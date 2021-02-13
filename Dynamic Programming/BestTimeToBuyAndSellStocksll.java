class Solution {
    public int maxProfit(int[] prices) {
        int buy = Integer.MAX_VALUE; 
        int profit = 0;
        int total = 0; 
        // Set length at length - 1 so you don't go out of bounds 
        for(int i = 0; i < prices.length - 1; i++) {
            // If the position we are at is lower than the one next to it then add it to the total 
           if(prices[i] < prices[i + 1]){
            total+= prices[i + 1] - prices[i]; 
           }
        }
        
        
        return total; 
    }
}
