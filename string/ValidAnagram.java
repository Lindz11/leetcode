class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length())
            return false; 
        char t_arr [] = t.toCharArray(); 
        char s_arr [] = s.toCharArray(); 
        Arrays.sort(t_arr); 
        Arrays.sort(s_arr); 
        int length  = t_arr.length; 
        for(int i = 0; i < length;i++){
            if(t_arr[i]!=s_arr[i])
                return false; 
        }
        
        return true; 
    }
}
