class Solution {
    public String interpret(String command) {
        HashMap<String, String> parse = new HashMap<>(); 
        parse.put("G","G"); 
        parse.put("()","o"); 
        parse.put("(al)","al"); 
        StringBuilder sb = new StringBuilder();
        String p =""; 
        for(char ch: command.toCharArray()) {
            p+=ch;  
            if(parse.containsKey(p))
            {
                sb.append(parse.get(p));
                p="";  
            }
        }
        
        return sb.toString(); 
    }
}
