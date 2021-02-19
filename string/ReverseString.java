class Solution {
    public void reverseString(char[] s) {
        StringBuilder sb = new StringBuilder(); 
        for(char c: s) {
            sb.append(c); 
        }
        String rev = sb.reverse().toString(); 
        for(int i = 0; i < s.length; i++)
        {
            s[i] = rev.charAt(i); 
        }
        return; 
    }
}
