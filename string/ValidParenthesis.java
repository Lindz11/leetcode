class Solution {
    public boolean isValid(String s) {
       Stack <Character> pairs = new Stack<Character>(); 
        int length = s.length();
        if( length < 2)
            return false; 
        for(int i = 0; i < length; i ++) {
            if(s.charAt(i) == '(')
                pairs.push(s.charAt(i));
            else if(s.charAt(i) == '{')
                pairs.push(s.charAt(i));
            else if(s.charAt(i) == '[')
                pairs.push(s.charAt(i));
            else if(s.charAt(i) == ')' && !pairs.empty() && pairs.peek() == '(')
                pairs.pop();
            else if(s.charAt(i) == '}' && !pairs.empty() && pairs.peek() == '{')
                pairs.pop();
            else if(s.charAt(i) == ']' && !pairs.empty() && pairs.peek() == '[')
                pairs.pop();
            else 
                pairs.push(s.charAt(i));
        }
        if(pairs.empty())
            return true; 
        return false; 
    }
}
