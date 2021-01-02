class Solution {
    public int majorityElement(int[] nums) {
        int length = nums.length; 
        int major = length/2; 
        int value = 0; 
        int r = 0; 
        HashMap<Integer, Integer> answer = new HashMap<>(); 
        for(int i = 0; i < length; i++) {
            if(!answer.containsKey(nums[i]))
                answer.put(nums[i], 1); 
            else 
            {
                answer.put(nums[i], answer.get(nums[i]) + 1);
            }
            if(answer.get(nums[i]) > major){
                r = nums[i];
                break; 
            }
        }
        return r;
    }
}
