class Solution {
    public String longestCommonPrefix(String[] strs) {
        String common = ""; 
        if(strs == null || strs.length == 0)
            return common; 
        int length = strs.length; 
        int index = 0;  
        // Take the first word from the array 
        char [] first = strs[0].toCharArray();
        for(int j = 0; j < first.length; j++){
            // Compare each letter one at a time 
            char c = first[j];
            for(int i = 1; i < strs.length; i++) {
                // Check if we go out of bounds or if the letters do not match
                if(index >=strs[i].length() || c != strs[i].charAt(index))
                    return common; 
            }
            // increment both the common prefix and the index
            common+=c; 
            index++;
            
        }
        
        return common; 
    }
}
