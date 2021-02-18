class Solution {
    public int[] countBits(int num) {
        if(num == 0)
        {
            int [] np = new int[1]; 
            np[0] = 0; 
            return np; 
        }
        if(num == 1)
        {
            int [] np = new int[2]; 
            np[0] = 0;
            np[1] = 1;
            return np;
        }
        int [] dp = new int[num + 1]; 
        dp[0] = 0; 
        dp[1] = 1; 
        for(int i = 2; i <= num; i++) {
            if(i % 2 == 0)
                dp[i] = dp[i/2]; 
            else
                dp[i] = dp[i/2] + 1; 
        }
        return dp; 
    }
    
}
