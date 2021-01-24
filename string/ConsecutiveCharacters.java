class Solution {
    public int maxPower(String s) {
        char [] ch = s.toCharArray(); 
        int length = ch.length; 
        if( length == 1)
            return 1;
        int count = 1;
        int max = 1; 
        char prev = ' '; 
        for(int i = 0; i < length; i++) {
            if(ch[i] == prev){
                count++; 
                max = Math.max(max, count);
            }
            else{
                prev = ch[i]; 
                count = 1; 
            } 
        }
        return max; 
    }
}
