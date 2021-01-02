class Solution {
    public int[] twoSum(int[] nums, int target) {
        int length = nums.length; 
        int [] memo = new int [2]; 
        HashMap<Integer, Integer> unique = new HashMap<>();
        return recurseSum(nums, target, 0, unique, memo); 
    }
    public static int[] recurseSum(int [] nums, int target, int index, HashMap<Integer, Integer> unique,int [] memo ) { 
        int difference = 0; 
        difference = target - nums[index]; 
        if(unique.containsKey(difference)){
            memo[0] = index; 
            memo[1] = unique.get(difference);
            return memo; 
        }
        else{
            unique.put(nums[index], index); 
            return recurseSum(nums, target, index + 1, unique, memo);
        }
    }
}
