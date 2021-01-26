class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        List<Integer> all = new ArrayList<>(); 
        for(int i = 0; i < nums.length; i++) {
            all.add(index[i], nums[i]); 
        }
        
        Object [] num = all.toArray();
        int [] answer = new int [nums.length]; 
        int j = 0; 
        for(Object obj: num) {
            answer[j] = (int)obj; 
            j++; 
        }
        
        return answer; 
    }
}
