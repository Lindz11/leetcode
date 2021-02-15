class Solution {
    public boolean isMonotonic(int[] A) {
        boolean neg = false; 
        boolean pos = false;
        for(int i = 0; i < A.length - 1; i++) {
            int mono = A[i] - A[i + 1];
            if(mono < 0 && neg == true)
                continue;
            if(mono < 0)
                neg = true; 
            if(mono > 0 && neg == true)
                return false; 
        }
        for(int i = 0; i < A.length - 1; i++) {
            int mono = A[i] - A[i + 1];
            if(mono > 0 && pos == true)
                continue;
             if(mono > 0)
                pos = true; 
            if(mono < 0 && pos == true)
                return false;
        }
        
        return true; 
    }
}
