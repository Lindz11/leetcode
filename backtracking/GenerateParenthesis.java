class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> all = new ArrayList<>(); 
        helper(all, 0, 0, n, ""); 
        return all; 
    }
    
    void helper(List<String> all, int open, int closed, int n, String paren) {
        if(open == n && closed == n){
            all.add(paren); 
        }
        else
        {
            if(open!=n)
            {
                helper(all, open + 1, closed, n, paren + '('); 
            }
            if(closed < open)
            {
                helper(all, open, closed + 1, n , paren + ')'); 
            }
        }
    }
}
