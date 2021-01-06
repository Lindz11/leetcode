class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0, j = 0;

        Set<Character> uniq = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {

            char c = s.charAt(i);
            while(uniq.contains(c)) {
                uniq.remove(s.charAt(j));
                j++;
            }
            uniq.add(c);
            max = Math.max(uniq.size(), max);
        }
        return max;
    }
        
    
    
}
