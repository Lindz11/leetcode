class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Breath first search approach
        if(root == null)
            return true; 
        
        return recurseSym(root.left, root.right); 
    }
    
    public static boolean recurseSym(TreeNode left, TreeNode right) {
        if(left == null && right == null)
            return true;
        if(left != null && right == null || left == null && right!= null)
            return false; 
        if(left.val != right.val)
            return false;
        if(left.val == right.val)
            return recurseSym(left.left, right.right) && recurseSym(left.right , right.left);
        return true;    
    }
}
