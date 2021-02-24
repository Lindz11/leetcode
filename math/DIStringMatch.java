class Solution {
    // Read the string and have then have the starting int be 0
    // then from 1 to n - 1 go and add a plus or minus to each index in the array
    public int[] diStringMatch(String S) {
        int start = 0; 
        int end = S.length(); 
        int [] ans = new int [S.length() + 1]; 
        if(S.charAt(0) == 'D')
            ans[0] = end--; 
        else
            ans[0] = start++; 
        for(int i = 1; i < ans.length -1 ; i++) {
            if(S.charAt(i) == 'I')
            {
                ans[i] = start; 
                start++; 
            }
            if(S.charAt(i) =='D')
            {
                ans[i] = end; 
                end--;  
            }
        }
        ans[ans.length - 1] = start--; 
        return ans; 
    }
}
