// This problem involves either a stack of queue version and adding each level into an arraylist 
// A good beginning to breadth first search problems
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>(); 
        if(root == null)
            return ans; 
        Queue<TreeNode> q = new LinkedList<>();
        //  Add the root to the queue
        q.add(root); 
        // While the queue is not empy 
        while(!q.isEmpty()) {
            int cnt = q.size(); 
            // Look at the next node in the queue
            List<Integer> levels = new ArrayList<>();
            // while the size of the queue is not 0 take everything out at the current level 
            for(int i = 0; i < cnt; i++) { 
                // Make an array
                TreeNode node = q.poll();
                levels.add(node.val);
                if(node.left!= null)
                {
                    q.add(node.left); 
                }
                if(node.right!=null) 
                {
                    q.add(node.right); 
                }
            }
            // Add the ndoe that we are at into ther arraylist 
            ans.add(levels); 
        }
        
        return ans; 
        
    }
}
