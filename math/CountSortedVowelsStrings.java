class Solution {
    int answer = 0;
    public int countVowelStrings(int n) {
        String vowels = "aeiou";  
        int length = vowels.length();
        helper(n, 0, 0);
        return answer; 
    }
    
    private void helper(int n , int index, int len) {
        if(len == n) {
            answer++;  
            return; 
        }
        // For each vowel in the vowels string
        for(int i = index; i < 5; i++) {
            // Increment length
           len++;  
            // Do a DFS approach 
           helper(n, i, len); 
            // Decrement length when you go back from the call stack
           len --; 
        }
    }     
}
