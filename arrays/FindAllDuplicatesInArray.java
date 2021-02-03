class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>(); 
        List<Integer> answer = new ArrayList<>(); 
        for(int i : nums) {
            if(numbers.contains(i))
                answer.add(i); 
            
            numbers.add(i);
        }
        
        return answer; 
    }
}
