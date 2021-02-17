class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        int max = -1; 
        for(int i : arr)
        {
            freq.put(i, freq.getOrDefault(i, 0) + 1); 
        }
        
        for(Map.Entry<Integer, Integer> entry : freq.entrySet()) {
            int key = entry.getKey(); 
            int value = entry.getValue(); 
            if(key == value)
                max = key; 
        }
        
        return max; 
    }
}
