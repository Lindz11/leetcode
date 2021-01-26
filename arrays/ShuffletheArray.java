class Solution {
    public int[] shuffle(int[] nums, int n) {
      int odd = 0; 
      int [] shuffle = new int [2*n];  
      for( int i = 0; i < n; i++) {
          shuffle[odd] = nums[i]; 
          odd+=2; 
      }
        
      int even = 1; 
      for(int j = n; j < nums.length; j++) {
          shuffle[even] = nums[j]; 
          even+=2; 
      }
        
      return shuffle; 
    }
}
