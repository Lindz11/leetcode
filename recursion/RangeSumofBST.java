class Solution {
    int sum = 0; 
    public int rangeSumBST(TreeNode root, int low, int high) {
        helper(root, low, high);
        return sum; 
    }
    
    private void helper(TreeNode root, int low, int high) {
        // If the root is null or if root is less than our low range or greater than our high range then return
        if(root == null)
            return; 
        else 
        {
            // Check to see if the node that we are at fits in our range
            if(root.val >= low && root.val <= high){
                // If it does add it and go deeper
                sum+=root.val; 
            } 
        }
        helper(root.left, low, high);
        // Do another call on the right side of the tree 
        helper(root.right, low, high);
    }
}
