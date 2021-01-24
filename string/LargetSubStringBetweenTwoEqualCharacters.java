class Solution {
    public int maxLengthBetweenEqualCharacters(String s) {
        HashMap<Character, Integer> index = new HashMap<>();  
        int max = Integer.MIN_VALUE; 
        char[] ch = s.toCharArray(); 
        int length = ch.length; 
       for(int i = 0; i < length; i++) {
           if( index.containsKey(ch[i])){
               max = Math.max(max, i - index.get(ch[i]));  
           }
           else
           {
               index.put(ch[i], 1 + i); 
           }
        }
        
        if(max == Integer.MIN_VALUE)
            return -1;
        
        return max; 
    }
}
