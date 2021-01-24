class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() == 0)
            return true; 
        int i = 0; 
        int j = s.length() - 1; 
        while(i < j) {
            if(!Character.isLetterOrDigit(s.charAt(i))){
                i++; 
                continue; 
            }
            if(!Character.isLetterOrDigit(s.charAt(j))){
                j--; 
                continue; 
            }
            else
            {
                if(Character.toLowerCase(s.charAt(j)) != Character.toLowerCase(s.charAt(i)))
                    return false; 
                else
                {
                    i++; 
                    j--; 
                } 
            }
            
        }
        return true; 
            
    }
}
