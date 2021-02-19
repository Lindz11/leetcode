class Solution {
    public boolean stoneGame(int[] piles) {
        int alex = 0; 
        int lee = 0;
        int even = 0, odd = 0;  
        for(int i = 0; i < piles.length; i+=2)
        {
            even+= piles[i]; 
        }
        for(int j = 1; j < piles.length; j+=2)
        {
            odd+= piles[j]; 
        }
        System.out.println(even); 
        if( even > odd)
            return true; 
        if(odd > even)
            return true; 
        
        return false;
    }
}
