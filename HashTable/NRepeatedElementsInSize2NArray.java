class Solution {
    public int repeatedNTimes(int[] A) {
        HashSet<Integer> unq = new HashSet<>(); 
        for(int i : A){
            if(unq.contains(i))
                return i; 
            unq.add(i); 
        }
        
        return 0; 
    }
}
