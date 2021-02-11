class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        PriorityQueue<Integer> elements = new PriorityQueue<>(); 
        for(int i = 0; i < matrix.length; i ++) {
            for(int j = 0; j < matrix.length; j++) {
                elements.add(matrix[i][j]); 
            }
        }
        
        while(k > 1) {
            elements.poll(); 
            k--;
        }
        return elements.poll(); 
    }
}
