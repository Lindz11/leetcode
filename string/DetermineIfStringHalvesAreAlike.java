class Solution {
    public boolean halvesAreAlike(String s) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u','A','E','I','O','U'));
        int left = 0; 
        int right = 0; 
        int i = 0; 
        int j = s.length() - 1; 
        while(i < j) {
            if(vowels.contains(s.charAt(i)))
                left++; 
            if(vowels.contains(s.charAt(j)))
                right++; 
            i++; 
            j--; 
        }
        
        if(left == right)
            return true; 
        return false;
    }
}
