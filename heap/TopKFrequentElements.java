class Solution {
    class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freq = new HashMap<>(); 
        for(int i : nums) {
            freq.put(i, freq.getOrDefault(i,0)+1); 
        }
        
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((a, b)->b.getValue()-a.getValue());
        
        for(Map.Entry<Integer,Integer> entry : freq.entrySet())
            queue.add(entry); 
        int [] answer = new int[k]; 
        int i = 0; 
        while(i!=k){
            answer[i] = queue.poll().getKey(); 
            i++; 
        }
        
        return answer; 
    }
}
