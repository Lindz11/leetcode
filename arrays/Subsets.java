class Solution {
    List<List<Integer>> answers = new ArrayList<>(); 
    public List<List<Integer>> subsets(int[] nums) {
        List<Integer> subs = new ArrayList<>(); 
        helper(nums, 0, subs); 
        return answers; 
    }
    
    private void helper(int [] nums, int index, List<Integer> subs) { 
        // add every instance of the sub arraylist that we see 
        answers.add(new ArrayList<>(subs)); 
        // Loop through every part of the nums array 
        for(int i = index; i < nums.length; i++) {
            subs.add(nums[i]);
            helper(nums, i + 1, subs); 
            subs.remove(subs.size() - 1); 
        }
    }
}
