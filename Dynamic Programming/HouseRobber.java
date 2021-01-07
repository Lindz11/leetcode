class Solution {
    public int rob(int[] nums) {
        int length = nums.length; 
        int [] dp = new int [length]; 
        if(nums.length == 0)
            return 0; 
        if(nums.length == 1)
            return nums[0]; 
        if(nums.length == 2)
            return Math.max(nums[0], nums[1]); 
        dp[0] = nums[0];
        dp[1] = Math.max(nums[0], nums[1]);  
        for(int i = 2; i < length; i++) {
            dp[i] = Math.max(nums[i] + dp[i - 2], dp[i - 1]);
        }
        return dp[length - 1]; 
    }
}
