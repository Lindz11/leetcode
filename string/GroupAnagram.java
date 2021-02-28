class Solution {
    // For this problem we want to go through every word in the string words array 
    // Sort the word lexographically and see if it is already in a data structure that we were using 
    // Then we also have to find a way to sort the anagrams by length; 
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>(); 
         for(String words: strs) {
             char [] ch = words.toCharArray(); 
             Arrays.sort(ch); 
             String sort = new String(ch); 
             if(map.get(sort) == null)
                 map.put(sort, new ArrayList<String>()); 
             map.get(sort).add(words);
         }
        List<List<String>> ans = new ArrayList<>(map.values()); 
        return ans; 
    }
}
