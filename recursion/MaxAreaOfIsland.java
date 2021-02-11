class Solution {
    int numOfIslands = 0; 
    public int maxAreaOfIsland(int[][] grid) {
        // go through the 2D array look for a 1 and its surrounding parts
        int max = 0; 
        for(int i = 0; i < grid.length; i++){
            for(int j = 0; j < grid[0].length; j++) {
                max = Math.max(max, dfs(grid, i, j)); 
            }
        }
        return max;  
    }
    
    public int dfs(int [][] grid, int row, int col) {
        // If the row we are passed is less than 0 or the col is less than 0 or greater than the length return 0
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length  || grid[row][col] == 0)
            return 0; 
        // Set it equal to 0
        grid[row][col] = 0; 
        // Increment the counter for the island and adjacents next to it 
        int count = 1;
        // Check the adjacent rows and cols
        count += dfs(grid,row + 1, col);
        count += dfs(grid,row - 1, col);
        count += dfs(grid,row, col + 1);
        count += dfs(grid,row, col - 1);
        
        return count; 
    }
   
}
