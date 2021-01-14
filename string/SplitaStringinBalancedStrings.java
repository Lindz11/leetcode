class Solution {
    public int balancedStringSplit(String s) { 
        int balanced = 0;
        int count = 0; 
        for(char ch: s.toCharArray()){
            if(ch == 'R')
                balanced++; 
            else
                balanced--; 
            if(balanced == 0)
                count++; 
        }
        return count; 
    }
}
