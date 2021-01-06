class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> unique = new HashMap<>(); 
        int length = s.length();  
        for(int i = 0; i < length; i++) {
            if(unique.containsKey(s.charAt(i)))
                unique.put(s.charAt(i), unique.get(s.charAt(i)) + 1); 
            else 
                unique.put(s.charAt(i), 1);  
        }
        for (int j = 0; j < length; j++) {
            if(unique.get(s.charAt(j)) == 1)
                return j; 
        }
        return -1; 
    }
}
