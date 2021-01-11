class Solution {
    public int[][] flipAndInvertImage(int[][] A) {
        int length = A.length; 
        int inner_length = A[0].length; 
        for(int i = 0; i < A.length; i++)
        {
            for(int j = 0; j < A[i].length/2; j++)
            {
                int tmp = A[i][A[i].length - j - 1];
                A[i][A[i].length - j - 1] = A[i][j];
                A[i][j] = tmp;
            }
        }
        for( int i = 0; i < length; i ++)
            for(int j = 0; j < inner_length; j++){
                if(A[i][j] == 1)
                    A[i][j] = 0; 
                else
                    A[i][j] = 1; 
            }
        
        return A; 
        
    }
}
