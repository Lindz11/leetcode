class Solution {
    public String thousandSeparator(int n) {
        String num = Integer.toString(n); 
        int length = num.length(); 
        StringBuilder str = new StringBuilder(); 
        int count = 0; 
        for(int i = length - 1; i >=0 ; i--){
            count++; 
            str.append(num.charAt(i));
            if(count % 3 == 0 && i!=0){
                str.append('.'); 
                count = 0; 
            } 
        }
        return  str.reverse().toString(); 
    }
}
