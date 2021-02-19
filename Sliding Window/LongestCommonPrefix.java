class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = ""; 
        if(strs.length == 0 || strs == null)
            return common; 
        String word = strs[0]; 
        int index = 0; 
        for(int i = 0; i < word.length(); i++) {
            char c = word.charAt(i); 
            for(int j = 1; j < strs.length; j++) {
                if(index >= strs[j].length() || c != strs[j].charAt(index))
                {
                    return common; 
                } 
            }
            common+=c; 
            index++;  
        }
        
        return common; 
    }
}
