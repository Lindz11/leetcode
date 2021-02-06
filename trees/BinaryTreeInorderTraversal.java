class Solution {
    List<Integer> inorder = new ArrayList<>(); 
    public List<Integer> inorderTraversal(TreeNode root) {
        if(root == null)
            return inorder; 
        helper(root); 
        return inorder; 
    }
    
    void helper(TreeNode root) {
        if(root == null)
            return;  
        helper(root.left);
        inorder.add(root.val);
        helper(root.right); 
    }
}
