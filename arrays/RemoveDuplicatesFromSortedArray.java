class Solution {
    public int removeDuplicates(int[] nums) {
        int length = nums.length; 
        int count = 0; 
        if( length == 0)
            return 0; 
        for( int i = 1; i < length; i++) {
            if(nums[count]!= nums[i]) {
                count++;
                nums[count] = nums[i];
            }
        }
        return count + 1; 
    }
}
