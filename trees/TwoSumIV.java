class Solution {
    // Use a hashset to store every number that we see in the binary tree 
    // Use the target integer k minus every root val we see to cal difference
    // See if that difference is ever in our hashset 
    public boolean findTarget(TreeNode root, int k) {
        if(root == null)
            return false;
        HashSet<Integer> seen = new HashSet<>();
        return helper(root, k, seen); 
    }
    
   public boolean helper(TreeNode root, int k, HashSet<Integer> seen) {
        if(root == null)
            return false; 
        if(seen.contains(root.val))
            return true; 
        seen.add(k - root.val);  
        return helper(root.left, k, seen) || helper(root.right, k, seen); 
    }
}
