/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode invertTree(TreeNode root) {
        // If the root is null then return
        if(root == null)
            return null;
      // Looking at the example we need to swap the left and the right nodes for each level that we are on 
      TreeNode temp = root.right;   
      // Set the right node equal to temp and set right equal to the left node after 
      root.right = root.left;
      root.left = temp;
      // Set the left equalt to temp 
      // Do a recursive call on the right and left side; 
      invertTree(root.left); 
      invertTree(root.right); 
        
      return root; 
    }
    
    
}
