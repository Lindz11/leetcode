class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>(); 
        for(int i: nums) {
            if(numbers.contains(i))
                return i; 
            numbers.add(i); 
        }
        return 0; 
    }
}
