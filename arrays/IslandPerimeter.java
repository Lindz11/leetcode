class Solution {
    // The edge cases that we have to think about. 
    // We need to check below, above, to the left, and to the right of the square we are on 
    public int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int count = 0; 
        for(int i = 0; i < row;i++){
            int col = grid[i].length; 
            for(int j = 0; j < col; j++) {
                if(grid[i][j] == 1){
                    // This is the case for below us 
                    if(i - 1 < 0  || grid[i - 1][j] == 0)
                        count++; 
                    // This is the case for above us
                    if( i  + 1 > row - 1 || grid[i + 1][j] == 0)
                        count++; 
                    // This is the case for the left 
                    if(j - 1 < 0 || grid[i][j - 1] == 0)
                        count++; 
                    // This is the case for the right
                    if(j + 1 > col - 1 || grid[i][j + 1] == 0)
                        count++; 
                }
            }
        }
        return count; 
    }
}
