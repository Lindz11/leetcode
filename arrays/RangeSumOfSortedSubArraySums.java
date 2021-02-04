class Solution {
    public int rangeSum(int[] nums, int n, int left, int right) {
        int M = (int)1e9 + 7;
        List<Integer> sums = new ArrayList<>(); 
        int  count = 0;
        int length = nums.length; 
        for(int i = 0; i < length; i++){
            sums.add(nums[i]); 
            count = nums[i]; 
            for(int j = i + 1; j < length; j++) {
                count+= nums[j]; 
                sums.add(count); 
            }
        } 
         Collections.sort(sums);
        int ans = 0;
        for (int i = left - 1; i <= right - 1; ++i) {
            ans = (ans% M + sums.get(i)% M) % M;
        }
        return ans;
    }
}
