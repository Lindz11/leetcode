class Solution {
    // This a simple problem where we have 3 steps 
    // 1. save the value at i.j in a temp  
    // 2. set the i.j to j.i
    // 3. now overwrite j.i  with the temp
    public int[][] transpose(int[][] matrix) {
        if(matrix.length == 0)
            return new int[0][0]; 
        int row = matrix.length; 
        int col = matrix[0].length; 
        int [][] B = new int [col][row]; 
        for(int i = 0; i < row; i++)
            for(int j = 0; j < col; j++) {
               B[j][i] = matrix[i][j]; 
            }
         return B; 
    }
    
}
