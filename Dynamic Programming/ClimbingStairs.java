class Solution {
    
    public int climbStairs(int n) {
        int [] dp = new int [n + 1];
        dp[0] = 1; 
        dp[1] = 1; 
        for(int i = 2; i <=n; i++){
            dp[i] = dp[i - 1] + dp[i - 2]; 
        }
        
        return dp[n]; 
    }
    // Example 6 steps 
    /*
    dp[0] = 1
    dp[1] = 1
    dp[2] = 2
    dp[3] = 3
    dp[4] = 5 = 3 + 2
    dp[5] = 8 = 5 + 3
    dp[6] = 13 = 8 + 5
    */
}
