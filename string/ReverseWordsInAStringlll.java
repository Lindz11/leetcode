class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder(); 
        String ans = ""; 
        for(char ch : s.toCharArray()) { 
            if(Character.isWhitespace(ch)) {
                ans+= sb.reverse().toString();
                ans+=" "; 
                sb.setLength(0);
                continue; 
            }
            
            sb.append(ch); 
            
        }
        
        ans+=sb.reverse().toString(); 
        return ans; 
    }
}
