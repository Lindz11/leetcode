class Solution {
    int sum = 0;  
    public int sumRootToLeaf(TreeNode root) {
        if(root == null)
            return 0; 
        helper(root, ""); 
        return sum; 
    }
    
    void helper( TreeNode root, String nums) {
        if(root == null){
            return;  
        } 
        nums+=root.val; 
        if(root.left == null && root.right == null) {
            sum+=Integer.parseInt(nums, 2); 
        }
        else
        {
            helper(root.left, nums);
            helper(root.right, nums);
        }
            
    }
}
