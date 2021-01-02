class Solution {
    public int reverse(int x) {
        int place = 1;
        place = 10; 
        int pop = 0; 
        int negative = 0; 
        if( x < 0) {
            x*=-1;
            negative = 1; 
        } 
        int reverse = x; 
        int answer = 0; 
        while(reverse != 0) {
            pop = reverse % 10 ; 
            reverse = reverse/10; 
            // My solution was accurate except for this pop edge case & answer edge case
            if (answer > Integer.MAX_VALUE/10 || (answer == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (answer < Integer.MIN_VALUE/10 || (answer == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            answer = (answer * 10) + pop;
        }
        
        
        if( negative == 1)
            return answer*=-1; 
        
        
        return answer; 
    }
}
