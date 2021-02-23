class Solution {
    // For this problem we need to go through the ints from left to right 
    // turn each integer into a string/ char array
    // Have an inside while loop testing each individual element
    // Then if it meets the criteria add it to our ans list array
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> ans = new ArrayList<>(); 
        boolean self = true; 
        for(int i = left; i <= right; i++) {
            self = true;
            String s = Integer.toString(i); 
            for(int j = 0; j < s.length(); j++) {
                if(Character.getNumericValue(s.charAt(j)) == 0)
                {
                    self = false; 
                    break; 
                }
                if(i % Character.getNumericValue(s.charAt(j))!= 0)
                {
                    self = false; 
                    break; 
                }
            }
            if(self == true)
                ans.add(i); 
        }
        
        return ans; 
    }
    
