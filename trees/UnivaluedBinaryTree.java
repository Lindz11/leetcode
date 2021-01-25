lass Solution {
    HashSet<Integer> nums = new HashSet<>(); 
    public boolean isUnivalTree(TreeNode root) {
        if(root == null)
            return true; 
        helper(root); 
        if(nums.size() > 1) 
            return false; 
        return true; 
    }
    
    private void helper(TreeNode root){
        if(root == null)
            return; 
        if(!nums.contains(root))
            nums.add(root.val); 
        helper(root.left); 
        helper(root.right); 
            
    }
    
}
