class Solution {
    // For this problem we want a global int that holds that last node value that we saw 
    // We want a minimum integer that starts at Integer.MAX_VAL 
    // we go through each node and compare and if prev is not the set value set make prev the node we are at 
    // After we do a DFS call left then we go right 
    int min = Integer.MAX_VALUE; 
    int prev = -1; 
    public int minDiffInBST(TreeNode root) {
        if(root == null)
            return 0; 
        helper(root); 
        return min; 
    }
    
    void helper(TreeNode root) {
        if(root == null)
            return; 
        helper(root.left); 
        if(prev!= -1){
             min = Math.min(min, root.val - prev); 
        }
        prev = root.val; 
        helper(root.right); 
    }
}
