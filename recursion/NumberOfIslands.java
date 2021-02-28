class Solution {
    // For this problem we want to look through the matrix see if the island that we are at is surrounded by other ones
    // If so then we have found an island
    // Do a DFS to find other islands along this same path and see when we return from the call take MAX number of islands that we see 
    // Make sure when we do the DFS to look in all 4 directions 
    public int numIslands(char[][] grid) {
        int n = grid.length; 
        int m = grid[0].length; 
        int IslandsSeen = 0;
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == '1')
                {
                    DFS(grid,i,j,n,m);
                    IslandsSeen++;  
                }
            }
        }
        
        return IslandsSeen; 
    }
    
    void DFS(char [][] grid, int i, int j, int row, int col) {
        if(i  < 0 || i >= row || j < 0  || j >= col || grid[i][j] != '1')
            return; 
      
        grid[i][j] = 0;  
        DFS(grid,i + 1, j, row, col);
        DFS(grid,i, j + 1, row, col);
        DFS(grid,i - 1, j, row, col); 
        DFS(grid,i, j - 1, row, col);
        
        
    }
}
