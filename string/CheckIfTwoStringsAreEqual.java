class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        String first = ""; 
        String second = ""; 
        
        // Go through first string array and add all the characters into a new string
        for(String s: word1){
            for(char ch : s.toCharArray()){
                first +=ch; 
            }
        }
        
        // Go through second string array and add all characters into a new string  
        for( String n: word2) {
            for(char c: n.toCharArray()) {
                second+= c; 
            }
        }
        
        // Check if they have equal length
        if(first.equals(second))
            return true; 
        
        return false; 
    }
}
