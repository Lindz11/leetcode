class Solution {
    public List<String> commonChars(String[] A) {
        if (A == null || A.length == 0) {
            return new ArrayList<>();
        }
        
        List<String> ans = new ArrayList<>();
        HashMap<Character, Integer> common = new HashMap<>();
        
        for (char c : A[0].toCharArray()) {
            common.put(c, common.getOrDefault(c, 0) + 1);
        }
        
        for (int i = 1; i < A.length; i++) {
            HashMap<Character, Integer> temp = new HashMap<>();
            for (char c : A[i].toCharArray()) {
                if (common.containsKey(c)) {
                    temp.put(c, temp.getOrDefault(c, 0) + 1);
                    if (temp.get(c) > common.get(c)) {
                        temp.put(c, common.get(c));
                    }
                }
            }
            common = temp; 
        }
        
        for (Map.Entry<Character, Integer> entry : common.entrySet()) {
            char c = entry.getKey();
            int count = entry.getValue();
            
            for (int i = 0; i < count; i++) {
                ans.add(c + "");
            }
        }
        
        return ans;
    }
}
