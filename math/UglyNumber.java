class Solution {
    public boolean isUgly(int num) {
        // If the number is negative or zero then return false 
        if( num <= 0)
            return false; 
        // while the number is greater than 1 
        while(num > 1){
            // check to see if the number is divisible by 2
            if(num % 2 == 0){
                num = num/2;
            }
            // check to see if the number is divisible by 3
            else if(num % 3 == 0)
            {
                num = num/3; 
            }
            // check to see if th enumber is divisible by 5
            else if(num % 5 == 0)
            {
                num = num/5; 
            }
            // if not then return false 
            else
                return false; 
        }
        
        // if we get through this loop then we return true;
        return true; 
    }
}
