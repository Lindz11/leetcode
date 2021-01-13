class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        HashSet<Character> allow = new HashSet<>(); 
        int length = words.length; 
        String word = ""; 
        int l = 0; 
        int distinct = 0;  
        for( int i = 0; i< allowed.length(); i++){
            allow.add(allowed.charAt(i)); 
        }
        
        // Enhanced for loop of the string array
        for(String string: words){ 
            // The count needs to be reset per string 
            l = 0; 
            // Enhanced character for loop of the string 
            for(char c : string.toCharArray() ) {
                // See if it is in the allowed array
                if(allow.contains(c)){
                    l++; 
                }
                else
                    break; 
            }
            
            // Compare the length to the string length
            if(l == string.length())
                distinct++; 
             
        }
        // return the distinct number of strings with allowed characters 
        return distinct; 
            
    }
