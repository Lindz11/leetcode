class Solution {
    // We want to have  arecursive functions that goes through the left side of both the right and left of the tree
    // If both the root.left anf root.right we are at is null then add it 
    // it the node we are at is null then just return; 
    // My solution was almost correct missed a few test cases, YOU NEED  A FLAG TO TELL YOU YOURE ON THE LEFT SIDE 
    int sum = 0; 
    public int sumOfLeftLeaves(TreeNode root) {
        if(root == null)
            return 0; 
        if(root.left == null && root.right == null)
            return 0; 
        helper(root, false);
        return sum; 
    }
    
    void helper(TreeNode root, boolean isLeft) {
        if(root == null)
            return; 
        if(root.left == null && root.right == null && isLeft)
        {
            sum+=root.val; 
        } 
        helper(root.left, true); 
        helper(root.right, false); 
    }
}
