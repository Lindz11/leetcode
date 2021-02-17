class Solution {
    // There are multiple parts to this problem
    // 1. Add all of the numbers to a hashset so u have no duplicates 
    // 2. Put the elements from the hashset into a ArrayList/Array and sort it 
    // 3. Then you can manually look for the third largest thing inside of the arraylist 
    // as long as it has a length greater than or equal to 3
    public int thirdMax(int[] nums) {
        HashSet<Integer> numbers = new HashSet<>(); 
        for(int i: nums)
        {
            numbers.add(i); 
        }
        
        List<Integer> list = new ArrayList<>(numbers); 
        Collections.sort(list); 
        
        if(list.size() < 3)
            return list.get(list.size() - 1);  
        
        return list.get(list.size() - 3); 
    }
}
