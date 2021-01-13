class Solution {
    public int diagonalSum(int[][] mat) {
        int length = mat.length;
        HashSet<Integer> unique = new HashSet<>(); 
        int principal = 0;
        int secondary = 0; 
        for( int i = 0; i < length; i++)
            for(int j = 0; j < length; j++){
                if(i == j){
                    principal+=mat[i][j];
                }
                if(i + j == length - 1) {
                    secondary+=mat[i][j]; 
                }
        }
        int sum = principal + secondary; 
        if(length % 2 == 1)
            sum = sum - mat[length/2][length/2]; 
        return sum; 
    }
}
