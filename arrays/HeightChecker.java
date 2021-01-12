class Solution {
    public int heightChecker(int[] heights) {
        int length = heights.length; 
        int [] ans = new int [length];  
        int times = 0; 
        ans = Arrays.copyOf(heights, length); 
        Arrays.sort(ans); 
        for(int j = 0; j < length; j++) {
            if(ans[j] != heights[j])
                times++; 
                
        }
        return times; 
    }
}
