class Solution {
    // Steps that we need to do for this problem
    // look through all of the vowels
    // add each vowel we are at to our string builder 
    // recursively go to the next index in our vowel string
    // we we come back delete the last string we saw if it was not a potential answer or e have seen that state before
    // Runtime: O(n + k)
    String vowels = "aeiou";  
    public int countVowelStrings(int n) {
        List<String> result = new ArrayList<>(); 
        helper(n, 0, new StringBuilder(), result); 
        return result.size(); 
    }
    
    void helper(int n, int index, StringBuilder sb, List<String> result) {
        if(sb.length() == n)
        {
            result.add(sb.toString()); 
            return; 
        }
        for(int i = index; i < vowels.length(); i++) {
            sb.append(vowels.charAt(i)); 
            helper(n, i, sb, result); 
            sb.deleteCharAt(sb.length() - 1);
        }
    } 
}
