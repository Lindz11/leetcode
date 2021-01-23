class Solution {
    public int lengthOfLastWord(String s) {
    // If the length if 0 return 0
        if(s.length() == 0 )
            return 0; 
        
        int count = 0; 
        // Split every word by a space
        String [] words = s.split(" ");
        // Get the count of the every word intil the last
        for(String n : words){
            count = n.length(); 
        }
        return count; 
    }
}
