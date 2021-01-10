class Solution {
    public int longestOnes(int[] A, int K) {
        // A two pointer sliding window problem
        int length = A.length;
        int pointer_a = 0;  
        for(int i = 0; i < length; i++) {
            // If its a 0 then decrement K 
            if(A[i] == 0){
                K--; 
            }
            if( K < 0) { 
                if(A[pointer_a] == 0){ 
                    K++;
                } 
                pointer_a++;
            } 
        }
        
        return length - pointer_a; 
    }
}
