class Solution {
    public boolean validMountainArray(int[] arr) {
        if(arr.length < 3)
            return false; 
        int max = 0; 
       for(int i: arr){
           max = Math.max(max, i); 
       }
       if(max == arr[arr.length - 1] || max == arr[0])
           return false;
       int j = 0; 
       while(arr[j]!= max){
           if(arr[j] == arr[j + 1] || j > 0 && arr[j] < arr[j - 1])
               return false; 
           j++; 
       }
        int after = j + 1; 
       while(after != arr.length - 1)
       {
           if(arr[after] < arr[after + 1] || arr[after] == arr[after + 1])
               return false; 
           after++; 
       }
        
        return true; 
    }
}
