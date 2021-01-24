class Solution {
    int max = 1; 
    public int maxDepth(Node root) {
        // If we are passed in a null root return 0
        if( root == null)
            return 0; 
        // Go to our helper function
        helper(root , 1); 
        // return the count 
        return max; 
    }
    
    // Each level is seperated by a null, I need to somehow find everytime i see a null
    private void helper(Node root, int count){
        if( root == null){ 
            return; 
        }
        // Compare the max to the count every single time
        max = Math.max(max, count); 
        for(Node child : root.children) {
            // everytime we go down another level incrememnt the count
             helper(child, count + 1); 
        } 
        
    }
}
