class Solution {
    public int singleNumber(int[] nums) {
        HashSet<Integer> unq = new HashSet<>(); 
        for(int i: nums){
            if(unq.contains(i)){
                unq.remove(i);
                continue; 
            }
            unq.add(i);   
        }
        for(Integer j: unq){
            return j; 
        }
        return 0; 
    }
}
