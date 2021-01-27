class Solution {
    public int[] replaceElements(int[] arr) {
        if(arr.length == 1)
        {
            int [] ans = new int[1]; 
            ans[0] = -1; 
            return ans; 
        }
        int max; 
        
        for(int i = 0; i < arr.length; i++) {
            max = -1; 
            for(int j = i + 1; j < arr.length; j ++) {
                max = Math.max(max, arr[j]); 
            }
            arr[i] = max; 
        }
        
        return arr; 
    }
}
