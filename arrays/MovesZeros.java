class Solution {
    public void moveZeroes(int[] nums) {
        int length = nums.length; 
        int next = 0; 
        for(int i = 0 ; i < length; i++ ) {
            if(nums[i] == 0)
                continue; 
            else
            {
                nums[next] = nums[i]; 
                next++; 
            }
        }
     int zeros = length - next; 
     for (int j = 0 ; j < zeros; j++)  
         nums[j + next] = 0; 
    }
}
