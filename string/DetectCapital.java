class Solution {
    public boolean detectCapitalUse(String word) {
        int capital = 0;
        boolean first = false; 
        int length = word.length(); 
        if(word.length() == 1)
            return true; 
        if(Character.isUpperCase(word.charAt(0)))
            first = true; 
        for(int i = 0; i < length; i++) {
            if(Character.isUpperCase(word.charAt(i)))
                capital++; 
        }
        if(Character.isUpperCase(word.charAt(word.length() - 1)) && capital ==1)
            return false; 
        
        if(capital == word.length() || capital == 0)
            return true; 
        
        if(capital == 1 && first == true)
            return true; 
        
        
        return false; 
    }
}
