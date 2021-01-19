class Solution {
    public boolean isSubsequence(String s, String t) {
        // If the string length is 0 then return the true
        if(s.length() == 0)
            return true; 
        HashSet<Character> sub = new HashSet<>(); 
        // Add everything in the first string to the hashset
        for( char ch: s.toCharArray()) {
            sub.add(ch); 
        }
        String n = ""; 
        // Add only those letters to a new string 
        for( char c : t.toCharArray()) {
            if(sub.contains(c))
                n+=c; 
        }
        
        int pointer_a = 0; 
        // Check to see if they are equal 
        for(int j = 0; j < n.length();j++) {
            if(s.charAt(pointer_a) == n.charAt(j))
                pointer_a++; 
            if(pointer_a == s.length())
                return true; 
        }
        
        return false; 
    }
}
