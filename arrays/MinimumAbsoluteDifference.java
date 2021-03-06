class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr); 
        List<List<Integer>> ans = new ArrayList<>(); 
        int min = Integer.MAX_VALUE; 
        for(int i = 0; i < arr.length - 1; i++){
            if (arr[i + 1] - arr[i] < min)
            {
                min = arr[i + 1] - arr[i];
                ans.clear(); 
            }
            if((arr[i + 1] - arr[i]) == min)
            {
                List<Integer> values = new ArrayList<>(); 
                values.add(arr[i]); 
                values.add(arr[i + 1]);
                ans.add(values); 
            }
    
        }
        
        return ans; 
    }
}
