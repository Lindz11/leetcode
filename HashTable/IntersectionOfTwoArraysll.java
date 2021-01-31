class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        Map<Integer, Integer> array1 = new HashMap<>();
        Map<Integer, Integer> array2 = new HashMap<>();
        
        for(int i : nums1) {
            array1.put(i, array1.getOrDefault(i, 0) +  1); 
        }
        
        for(int j : nums2) {
            if(array1.containsKey(j))
            {
                array2.put(j, array2.getOrDefault(j, 0) +  1); 
                array2.put(j, Math.min(array2.get(j), array1.get(j))); 
            }
        }
        List<Integer> nums = new ArrayList<>(); 
        for(Map.Entry mapElement: array2.entrySet()){
            int key = (int)mapElement.getKey(); 
            int value = array2.get(key); 
            while(value!=0){
                nums.add(key); 
                value--; 
            }  
        }
        
        Object [] o = nums.toArray(); 
        int [] ans = new int [o.length]; 
        int z = 0; 
        for(Object obj : o) {
            ans[z] = (int)obj; 
            z++; 
        }
        
        return ans; 
    }
}
