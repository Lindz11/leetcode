class Solution {
    public String generateTheString(int n) {
        String ans = "";
        if(n == 1) {
            ans+=(char)('a' + 1); 
            return ans; 
        }
            
        if(n%2 == 1){
            ans+='a'; 
            n--; 
        } 
        while(n!=1) {
            ans+=(char)('a'+ 1); 
            n--; 
        }
        
        ans+=(char)('a' + 2); 
        
        return ans; 
            
    }
}
