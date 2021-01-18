class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> sum = new HashMap<>(); 
        int length = nums.length; 
        int [] ans = new int[2]; 
        int diff = 0; 
        for(int i = 0 ; i < length; i++) {
            diff = target - nums[i]; 
            if(sum.containsKey(diff)){
                ans[0] = i; 
                ans[1] = sum.get(diff);
                break;  
            }
            else
            {
                sum.put(nums[i],  i); 
            }
        }
        
        return ans; 
    }
}
