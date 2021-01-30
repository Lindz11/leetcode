class Solution {
    public int findKthPositive(int[] arr, int k) {
        int max = 0;
        HashSet<Integer> nums = new HashSet<>();
        Queue<Integer> missing = new LinkedList<>();
        for(int i: arr) {
            nums.add(i);
            max = Math.max(max, i); 
        } 
        max = max + k; 
        for(int j = 1; j <= max ; j++){
            if(missing.size() == k)
                break; 
            if(!nums.contains(j)){ 
                missing.add(j); 
            } 
        }
        
        while(missing.size() != 1){
            missing.remove();  
        }
        
        return missing.poll(); 
    }
}
