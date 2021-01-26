class Solution {
    public int[] decompressRLElist(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(); 
        List<Integer> all = new ArrayList<>(); 
        for( int i = 0; i < nums.length; i+=2){
            while(nums[i]!=0){
                all.add(nums[i+1]);
                nums[i]--; 
            }
        }
        
        Object [] answer = all.toArray(); 
        int [] decompress = new int [answer.length]; 
        int j = 0; 
        for(Object obj: answer) {
            decompress[j] = (int)obj; 
            j++; 
        }
        
        return decompress; 
    }
}
