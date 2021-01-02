class Solution {
    public List<String> generateParenthesis(int n) {
        String paren = "";
        // Set both the open and closed parenthesis equal to n
        int open = n; 
        int closed = n;
        // Make the string arraylist and the helper function 
        List<String> all = new ArrayList<>(); 
        helper(n, open, closed, paren, all);
        return all; 
    }
    
    private void helper( int n, int open, int closed, String paren, List<String> all) {
        // If both the number of closed and open parens are 0 then add to the arraylist 
        if(open == 0 && closed == 0 )
            all.add(paren); 
        else{
            //  if there are any open parenthesis we can add, add them all as a depth first approach 
            if(open > 0)
                helper(n, open - 1, closed, paren + '(', all);
            // Check to see after if the open and closed parameters are imbalanced and if so a closed parenthesis
            if(closed > 0 && closed > open)
                helper( n, open, closed - 1, paren + ')', all);
        }
    }
}
