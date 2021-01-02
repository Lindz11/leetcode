class Solution {
    public int maxSubArray(int[] nums) {
        int length = nums.length; 
        int max = 0, sub = 0; 
        if(length == 1)
            return nums[0]; 
        sub = max = nums[0]; 
        for(int i = 1; i < length; i++){
            // System.out.println(" Max at the start is " + max);
            max = Math.max(nums[i], max + nums[i]);
            // System.out.println(" Subs is " + sub + " And the max is " + max);
            if(sub < max)
                sub = max; 
        }
        
        return sub; 
    }
}
