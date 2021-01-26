class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int sum = 0; 
        int curr_sum = 0; 
        int count; 
        for(int i = 0; i < arr.length; i++){
            curr_sum = 0;  
            count = 0; 
            for( int j = i; j < arr.length; j++){
                curr_sum+=arr[j];
                if(count%2 == 0){
                    sum+=curr_sum; 
                }
                count++; 
            }
        }
        
        return sum; 
    }
}
