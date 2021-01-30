class Solution {
    public int countCharacters(String[] words, String chars) {
        Map<Character, Integer> freq = new HashMap<>(); 
        for(char ch: chars.toCharArray()){
            freq.put(ch, freq.getOrDefault(ch, 0) + 1); 
        }
        int length; 
        int total = 0;
        boolean flag = true; ; 
        for(String s: words) {
            Map<Character, Integer> temp = new HashMap<>();
            flag = true; 
            // Go through every character 1 by 1; 
            for(char c : s.toCharArray()){
                if(freq.containsKey(c)){
                   temp.put(c, temp.getOrDefault(c, 0) + 1);
                    if(temp.get(c) > freq.get(c)){
                        flag = false; 
                        break; 
                    }
                }
                else
                {
                    flag = false; 
                    break; 
                }
                     
            }
            if(flag == true )
                total+=s.length(); 
        }
        
        return total; 
    }
