class Solution {
    public String reverseOnlyLetters(String S) {
       // Do a binary search approach to this question 
       // One pointer starting from the beginning one pointer starting from the end 
        int i = 0; 
        char [] ch = S.toCharArray();
        int j = ch.length - 1; 
        while(i < j) {
            // If it is not a digit iterate and continue
            if(!Character.isLetter(ch[i])){
                i++;
                continue;
            }
            // If it is not a digit iterate and continue 
            if( !Character.isLetter(ch[j])){
                j--;
                continue; 
            }
            
            // if they both are then go and swap them
            char temp = ch[i]; 
            ch[i] = ch[j]; 
            ch[j] = temp; 
            i++; 
            j--; 
        }
         
        return new String(ch); 
    }
}
