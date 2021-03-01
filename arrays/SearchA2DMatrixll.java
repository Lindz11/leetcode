class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length == 0)
            return false; 
        if(matrix[0][0] > target)
            return false; 
        int m = matrix.length; 
        int n = matrix[0].length; 
        for(int i = 0; i < n; i++) {
            if(matrix[0][i] == target)
                return true;
            if(matrix[0][i] > target)
            {
                n = i;
                break; 
            }     
        }
        
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if(matrix[i][j] == target)
                    return true; 
            }
        }
        
        return false; 
    }
}
