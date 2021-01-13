class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int length = nums.length; 
        int pointer_a = 0;
        int times = 0; 
        int max = 0; 
        for(int i = 0; i < length; i++){
            if(nums[i] == 1)
                times++;
            else
            {
              times = 0;   
            }
            max = Math.max(max,times); 
        }
        
        return max; 
    }
}
