class Solution {
    // For this problem we are going to create a hashmap 
    // Go through every combination of A and B 
    // If they are in the hashmap add it with a + 1 
    // If not initialize it to zero 
    // Then try and go through C + D , from examples this be equal to the negative of A + B 
    // And see if any of those are already in our hashmap
    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
       HashMap<Integer, Integer> freq = new HashMap<>();
        int n = A.length; 
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++)
            {
                int sum = A[i] + B[j]; 
                freq.put(sum,freq.getOrDefault(sum, 0) + 1); 
            }
        }
        System.out.println(freq.get(2)); 
        int ans = 0;
        for(int i = 0; i < n; i++) {
            int inverse = 0; 
            for(int j = 0; j < n; j++)
            {
                inverse = -(C[i] + D[j]); 
                System.out.println(inverse);
                if(freq.containsKey(inverse))
                {
                    ans += freq.get(inverse);
                }    
            }
        } 
        
        return ans; 
    }
}
