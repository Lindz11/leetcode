class Solution {
    // for this problem we want to loop through the arraylist 
    // use a hashtable to show what nodes we have seen 
    // go through the hashtable and see what nodes arent contained inside the hashtable 
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        HashSet<Integer> seen = new HashSet<>(); 
        for(List<Integer> l : edges) {
            seen.add(l.get(1)); 
        }
        List<Integer> ans = new ArrayList<>(); 
        for(int i = 0; i < n; i++) {
            if(!seen.contains(i))
            {
                ans.add(i); 
            }
        }
        
        return ans; 
    }
}
