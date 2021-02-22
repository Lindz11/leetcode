class Solution {
    // Since this is a BST there is a big chance that the solution is going to be something paired with the root 
    // We keep a int that is public to every function to keep track of the last node value that we saw 
    // start MIN and MX_VALUE and compare with each and every node 
    int min = Integer.MAX_VALUE;
    int prev;
    public int getMinimumDifference(TreeNode root) {
		prev= -1;
		dfs(root);
		return min;
	}
	public void dfs(TreeNode node) {
		if (node == null)
			return;
		dfs(node.left);
		if (prev != -1)
			min = Math.min(min, Math.abs(prev - node.val));
		prev = node.val;
		dfs(node.right);
	}
}
