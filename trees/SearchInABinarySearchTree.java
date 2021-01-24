class Solution {
    TreeNode temp = null;
    public TreeNode searchBST(TreeNode root, int val) { 
        // If we pass in an empty root then return 
        if(root == null)
            return temp; 
        // If the node we are at is the answer then return 
        if(root.val == val){
            return root;  
        } 
        // If not then we want to traverse left then we want to travers right to find the node 
        temp = searchBST(root.left, val); 
        temp = searchBST(root.right, val); 
        
        return temp; 
    }
}
