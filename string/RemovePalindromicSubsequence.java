class Solution {
    // The key to this problem is that there are only two letters being used in this palindrome
    // So this become a string theory questions 
    // Where if it is a valid palindrome then u can just delete the whole thing at once
    // While if it isn't you have to delete both letters seperately
    public int removePalindromeSub(String s) {
        if(s.length() == 0)
            return 0; 
        StringBuilder sb = new StringBuilder(s);
        StringBuilder ab = new StringBuilder(s);
        ab = ab.reverse(); 
        if(sb.toString().equals(ab.toString()))
            return 1;
       else
           return 2; 
    }
}
