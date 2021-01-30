class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        HashMap<String, Integer> b_words = new HashMap<>(); 
        HashMap<String, Integer> a_words = new HashMap<>();
        String [] as = A.split(" "); 
        String [] bs = B.split(" "); 
        
        for(String s : bs) {
            b_words.put(s, b_words.getOrDefault(s, 0) + 1); 
        }
        
        for(String n : as) {
            a_words.put(n, a_words.getOrDefault(n, 0) + 1); 
        }
        
        List<String> un = new ArrayList<>(); 
        for(String z : bs) {
            if(!a_words.containsKey(z) && b_words.get(z) == 1){
                un.add(z); 
            }
        }
        
        for(String y : as) {
            if(!b_words.containsKey(y) && a_words.get(y) == 1){
                un.add(y); 
            }
        }
        
        Object [] common = un.toArray(); 
        String []  answer = new String[common.length]; 
        int i = 0; 
        for(Object obj : common){
            answer[i] = obj.toString(); 
            i++; 
        }
        
        return answer; 
    }
}
