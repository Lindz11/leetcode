class Solution {
    // For this problem we need to go through the String and look to see if we are in a inner parenthesis or 
    // If the parenthesis we are at is just a regular balanced parenthesis 
    // We can try to use a stack to make sure we keep track of the inner parens 
    public int scoreOfParentheses(String S) {
        Stack<Integer> st = new Stack<>();
        int res = 0;
        for (char c : S.toCharArray()) {
            if (c == '(') {
                st.push(res);
                res = 0;
            } else {
                res = Math.max(1, res * 2);
                res += st.pop(); 
            }
        }
        return res;
    }
}
