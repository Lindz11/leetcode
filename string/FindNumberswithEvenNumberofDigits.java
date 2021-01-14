class Solution {
    public int findNumbers(int[] nums) {
        int digits = 0; 
        int count = 0; 
        for(int i : nums) {
            digits = Integer.toString(i).length(); 
            if(digits % 2 == 0)
                count++;  
        }
        return count; 
    }
}
