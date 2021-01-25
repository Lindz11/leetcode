class Solution {
    public int maxDepth(TreeNode root) {
        // If root is null return 0
        if( root == null)
            return 0; 
        // Do a depth first search traversing left and right 
       int left = 1 + maxDepth(root.left); 
       int right = 1 + maxDepth(root.right); 
        
        return Math.max(left,right);  
        
    }
}
