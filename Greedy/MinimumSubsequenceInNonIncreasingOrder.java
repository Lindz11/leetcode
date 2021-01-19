class Solution {
    public List<Integer> minSubsequence(int[] nums) {
        List<Integer> ans = new ArrayList<>(); 
        // Sort the array first 
        Arrays.sort(nums);
        int sum = 0; 
        // Get the sum of all of the elements in the array 
        for(int i : nums){
            sum+= i; 
        }
        int min = 0; 
        int length = nums.length - 1; 
        // Starting from the back of the array add 
        for(int j = length; j >=0 ; j--) {
            // If the sum is greater than or equal to the min then keep adding elements to our array list
            if(sum >= min){
                // Add the element we are at to the min
                min+= nums[j];
                // Add the answer to the arraylist 
                ans.add(nums[j]);
                // Decrement our sum
                sum-=nums[j]; 
            }
            else
                // If not then just break out of the loop
                break; 
                
        }
        return ans; 
    }
}
