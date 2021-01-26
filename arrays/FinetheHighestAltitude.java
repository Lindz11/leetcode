class Solution {
    public int largestAltitude(int[] gain) {
        int max = 0; 
        int [] alt = new int[gain.length + 1]; 
        alt[0] = gain[0]; 
        for(int i = 1; i < gain.length; i++){
            alt[i] = gain[i] + alt[i - 1]; 
        }
        
        for(int j : alt) {
            max = Math.max(max, j); 
        }
    
        return max; 
    }
}
