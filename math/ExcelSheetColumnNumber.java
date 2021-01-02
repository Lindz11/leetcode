class Solution {
    public int titleToNumber(String s) {
        int length = s.length(); 
        int alpha = 0; ; 
        int answer = 0; 
        for(int i = 0; i < length; i++) {
            alpha = s.charAt(i) - 'A' + 1; 
            answer = (answer * 26) + alpha; 
        }
        return answer; 
    }
}
