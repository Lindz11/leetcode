class Solution {
    boolean target; 
    public boolean hasPathSum(TreeNode root, int sum) {
        // If the root is null return false
        if(root == null)
            return false;
        helper(root, sum, 0);
        return target;   
    }
    
    private void helper(TreeNode root, int sum, int count) {
        if(root == null)
            return; 
        // From the example if the root left and right are null and the count + value we are 
        // at is equal to the sum flip target to true;
        if(root.left == null && root.right == null && count + root.val == sum){
            target = true; 
            return; 
        }
        count += root.val; 
        helper(root.left, sum, count); 
        helper(root.right, sum, count);
            
    }
}
