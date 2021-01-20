public String reformatNumber(String number) {
        if( number.length() == 2)
            return number; 
        String num = "";
        for(char ch: number.toCharArray()){
            if(Character.isDigit(ch))
                num+= ch; 
        }
        String ans = ""; 
        int i = 0; 
        int length = num.length(); 
        while(length > 4){
            ans += num.substring(i, i + 3) + '-'; 
            System.out.println(ans); 
            i+=3; 
            length -= 3; 
            System.out.println(length); 
        }
        if(length == 4){
            ans += num.substring(i, i + 2) + '-'; 
            i+=2;
            ans+= num.substring(i, i + 2); 
        }
        if (length == 3)
            ans+= num.substring(i, i + 3); 
        if (length == 2)
        {
            ans+=num.substring(i, i + 2); 
        }
        return ans; 
    }
}
