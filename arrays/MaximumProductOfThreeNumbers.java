class Solution {
    // For this problem the key things we need to do
    // KEY OF THIS PROBLEM - SORT THE ARRAY FIRST 
    // Then the problem becomes a number theory problem, or either the solution is at the end or the front plut the last index. 
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums); 
        int max = 0;  
        max = Math.max(nums[0] * nums[1] * nums[nums.length - 1], nums[nums.length - 1] * nums[nums.length - 2] * nums[nums.length - 3]); 
        return max; 
    }
}
