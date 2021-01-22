class Solution {
    public int reverse(int x) {
        int ans = 0; 
        boolean flag = true; 
        // Have a flag and test if the given integer is less than 0
        if(x < 0){
             flag = false; 
            x = x * -1; 
        }
        // Convert the number to a string 
        String num = Integer.toString(x); 
        StringBuilder sb = new StringBuilder(num);
        // Use string builder to reverse it and turn the number back to a string 
        String value = sb.reverse().toString();
        // Try to revert the string back to an int if its greater than INT_MAX
        try{
            ans = Integer.parseInt(value); 
        }
        // return 0
        catch(NumberFormatException e){
            return 0;
        }
        
        // if the flag is false then multiply it by -1
        if(flag == false)
            return ans * -1; 
        // else just return the ans
        return ans; 
        
    }
}
