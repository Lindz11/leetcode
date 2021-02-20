class Solution {
    // The key topics to this problem 
    // 1. For this problem to work the difference between digits and numbers has to be either 0 or 1 anything greater and it wont work 
    // You want to loop through the longer string for better runtime efficiency 
    // Sorting the characters into 2 string of digits and numbers helps 
    // Runtime : 0(n)
    public String reformat(String s) {
        StringBuilder letters = new StringBuilder(); 
        StringBuilder digits = new StringBuilder();
        for(char ch: s.toCharArray()) {
            if(Character.isDigit(ch))
                digits.append(ch); 
            else
                letters.append(ch); 
        }
        
        int diff = Math.abs(letters.length() - digits.length()); 
        if(diff > 1 )
        {
             return ""; 
        }
        
        StringBuilder longer;
        StringBuilder shorter;
        
        int i = letters.length(); 
        int j = digits.length();
        
        if(i > j)
        {
            longer = letters; 
            shorter = digits; 
        }
        else
        {
            longer = digits; 
            shorter = letters; 
        }
        
        StringBuilder sb = new StringBuilder();
        
        for (int z = 0; z < longer.length(); z++) {
            sb.append(longer.charAt(z));
            if (z < shorter.length()) {
                sb.append(shorter.charAt(z));
            }
        }
        
        
        return sb.toString(); 
        
    }
}
