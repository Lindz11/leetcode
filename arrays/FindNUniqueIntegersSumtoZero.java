class Solution {
    public int[] sumZero(int n) {
       ArrayList<Integer> nums = new ArrayList<>(); 
        if(n%2 == 1)
        nums.add(0); 
        int i = 1; 
        while(nums.size()!= n) {
            nums.add(i); 
            if(nums.size() == n)
                break; 
            nums.add(-i); 
            i++; 
        }
        Object [] ans = nums.toArray(); 
        int [] unq = new int[ans.length]; 
        int j = 0; 
        for( Object obj: ans) {
            unq[j] = (int)obj; 
            j++; 
        }
        
        return unq; 
        
    }
}
