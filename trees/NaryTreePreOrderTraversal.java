class Solution {
    List<Integer> answer = new ArrayList<>(); 
    public List<Integer> preorder(Node root) {
        // If we are passed in a null tree just return what we are given
        if(root == null)
            return answer;
        // Go to our helper function
        helper(root); 
        return answer; 
    }
    
    void helper(Node root) {
        // For pre order we want to add every node that we see first then return if its null
        answer.add(root.val);
        if(root == null)
            return;  
        // For every node that is a child just go and iterate through it 
        for(Node child : root.children) {
            helper(child); 
        } 
    }
    
}
