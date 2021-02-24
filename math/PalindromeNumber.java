class Solution {
    // For this problem add x into a stringbuilder 
    // Add x into another string builder and reverse them 
    // Test if the reverse and the original are equal 
    // If they arent then return false
    // If they are then return true; 
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder();
        StringBuilder ab = new StringBuilder();
        
        sb.append(x); 
        ab.append(x).reverse(); 
        if(sb.toString().equals(ab.toString()))
            return true; 
        return false; 
    }
}
