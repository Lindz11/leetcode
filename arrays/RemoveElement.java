class Solution {
    public int removeElement(int[] nums, int val) {
        int pointer_a = 0; 
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == val)
                continue; 
            nums[pointer_a] = nums[i]; 
            pointer_a++; 
        }
        
        return pointer_a; 
    }
}
