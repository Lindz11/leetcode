class Solution {
    // For this problem we need to go through the array, find everything from diagnols in the 2D matrix
    // Sort the array and try to put it back in the HashMap
    // Then we can use the hashmap and everytime we get through the diagnol go and retrieve its arraylist 
    // Get the vert first sorted element and put it in the index we are at 
    public int[][] diagonalSort(int[][] mat) {
        int m = mat.length; 
        int n = mat[0].length;
        Map<Integer,ArrayList<Integer>> map = new HashMap<>(); 
       for(int i = 0; i < m; i++) {
           for(int j = 0; j < n; j++) {
               int diff = i - j;
              if(map.get(diff) == null)
              {
                  map.put(diff, new ArrayList<Integer>());
              }
               map.get(diff).add(mat[i][j]); 
           }
       }
        
    for(int i = 0; i < m; i++) {
        for(int j = 0; j < n; j++) {
            int diff = i - j; 
            ArrayList<Integer> vals = map.get(diff); 
            Collections.sort(vals); 
            mat[i][j] = vals.get(0); 
            vals.remove(0); 
            map.put(diff, vals); 
        }
    }
     
    return mat; 
    }
}
