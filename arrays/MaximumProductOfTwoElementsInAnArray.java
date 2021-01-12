class Solution {
    public int maxProduct(int[] nums) {
        int length = nums.length; 
        int max = 0; 
        for( int i = 0; i < length; i++)
            for( int j = i + 1; j < length; j++){  
                max = Math.max(max, (nums[i] - 1)*(nums[j] - 1)); 
            }
        return max; 
    }
}
