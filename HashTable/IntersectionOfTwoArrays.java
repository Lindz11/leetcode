class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> arr = new HashSet<Integer>(); 
        for(int i : nums1){
            arr.add(i); 
        }
        HashSet<Integer> inter = new HashSet<>(); 
        for(int j : nums2){
            if(arr.contains(j) && !inter.contains(j))
                inter.add(j); 
        }
        
        int [] ans = new int[inter.size()]; 
        int count = 0; 
        for(int z : inter){
            ans[count] = z; 
            count++; 
        }
        return ans; 
    }
}
