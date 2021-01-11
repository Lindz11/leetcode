class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int length = nums.length; 
        int [] ans = new int [length];
        int times = 0; 
        for(int i = 0; i < length; i++) {
            for(int j = 0; j < length; j++) {
                if(nums[i] > nums[j] ){
                    ans[i]++; 
                }    
            }
        }
        
        return ans; 
    }
}
