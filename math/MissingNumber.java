class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        int length = nums.length; 
        if(nums[0] != 0)
            return 0; 
        if(nums[length - 1]!= length)
            return length; 
        for(int i = 1; i < length; i++) {
            if(nums[i]!= i)
                return i; 
        }
        return 0; 
    }
}
