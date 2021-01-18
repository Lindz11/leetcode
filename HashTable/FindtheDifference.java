class Solution {
    public char findTheDifference(String s, String t) {
        if(s.length() == 0)
            return t.charAt(0); 
        if(t.length() == 0)
            return s.charAt(0); 
        String ans = ""; 
        Map<Character, Integer> find = new HashMap<>(); 
        for( char ch: s.toCharArray()){
            find.put(ch, find.getOrDefault(ch, 0) + 1); 
        }
        
        for(char c : t.toCharArray()) {
            if(find.containsKey(c)){
                find.put(c, find.get(c) - 1); 
                if(find.get(c) < 0) {
                    ans+= c;  
                }
            }
            else{
                ans+= c; 
            }
        }
        
        return ans.charAt(0); 
        
    }
}
