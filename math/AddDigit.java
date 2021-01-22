class Solution {
    public int addDigits(int num) {
        if( num < 10)
            return num; 
        int sum;
        // While the number is greater than 9  
        while(num > 9){
            sum = 0;
            // Inside while loop testing if the number is not equal to zero 
            while(num !=0){
                int temp = num % 10; 
                sum+=temp; 
                num = num / 10;  
            }
            // If the sum we have divide by 10 is less than or equal to 0 return 
            if(sum/10 <= 0)
                return sum;
            // Else set it as the new number; 
            num = sum; 
        }
        
        return 0; 
    }
}
