class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> kids = new ArrayList<>(); 
        int max = 0; 
        for( int i : candies) {
            max = Math.max(max, i); 
        }
        
        for(int j : candies) {
            if(j + extraCandies >= max)
                kids.add(true); 
            else
                kids.add(false); 
        }
        
        return kids; 
    }
}
