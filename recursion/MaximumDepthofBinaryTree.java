class Solution {
    public int maxDepth(TreeNode root) {
        int left = 0; 
        int right = 0; 
        if(root == null)
            return 0; 
        if(root.left == null && root.right == null) 
            return 1; 
        TreeNode temp = root;
        if(temp.left!= null)
            left = 1 + maxDepth(temp.left); 
        if(temp.right!= null)
            right = 1 + maxDepth(temp.right); 
        
        if(left > right)
            return left; 
        else
            return right; 
    }
}
