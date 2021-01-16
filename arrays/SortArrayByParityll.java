class Solution {
    public int[] sortArrayByParityII(int[] A) {
        int length = A.length; 
        int [] odd = new int[length/2]; 
        int [] even = new int[length/2]; 
        int odd_idx = 0; 
        int even_idx = 0; 
        for( int i = 0; i < length; i++) {
            if(A[i]%2 == 1){
                odd[odd_idx] = A[i]; 
                odd_idx++; 
            }
            else{
                even[even_idx] = A[i]; 
                even_idx++; 
            }
        }
        int e_idx = 0; 
        int o_idx = 0; 
        for(int j = 0; j < length; j++){
            if(j % 2 == 0){
                A[j] = even[e_idx];
                e_idx++; 
            }
            else{
                A[j] = odd[o_idx]; 
                o_idx++; 
            }
        }
        return A; 
        
    }
}
