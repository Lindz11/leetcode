class Solution {
    // For this problem I want to do two linear passes making my overall runtime 0(n) instead of 0(n^2)
    // This will make it so that it takes less runtime for the same amount of memory usage
    // We use kind of a sliding window approach to make sure that each of our elements continously goes to the front 
    public void sortColors(int[] nums) {
        int pointer_a = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0)
            {
                int temp = nums[pointer_a]; 
                nums[pointer_a] = 0; 
                nums[i] = temp; 
                pointer_a++; 
            }
        }
       int pointer_b = pointer_a; 
        for(int j = 0; j < nums.length; j++) {
            if(nums[j] == 1)
            {
                int temp = nums[pointer_b]; 
                nums[pointer_b] = 1; 
                nums[j] = temp; 
                pointer_b++; 
            }
        } 
    }
}
