class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> jewel = new HashSet<>(); 
        for(char ch: jewels.toCharArray()){
            jewel.add(ch); 
        }
        
        int count = 0; 
        for( char c : stones.toCharArray()) {
            if(jewel.contains(c))
                count++; 
        }
        
        return count; 
    }
}
