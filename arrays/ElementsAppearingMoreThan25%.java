class Solution {
    public int findSpecialInteger(int[] arr) {
        if(arr.length == 1)
            return arr[0]; 
        int quart = arr.length/4; 
        int count = 1; 
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] == arr[i + 1])
            {
                count++;
                if(count > quart)
                    return arr[i]; 
            } 
            else
                count = 1; 
        }
        
        return 0; 
    }
}
