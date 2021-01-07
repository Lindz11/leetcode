class Solution {
    public int climbStairs(int n) { 
       int step1 = 1; 
       int step2 = 2; 
       int ans = 0; 
       int [] memo = new int [n + 1];
       return recurseStairs(n , ans, memo); 
    }
    
    public static int recurseStairs(int n, int ans, int [] memo ) {
        if(ans == n)
            return 1; 
        else if(ans > n)
            return 0; 
        else if( memo[ans] > 0)
            return memo[ans];
        
        memo [ans] = recurseStairs(n, ans + 1, memo) + recurseStairs(n, ans + 2, memo);
        return memo[ans]; 
    }
}
