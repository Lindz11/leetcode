class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer, Integer> freq = new HashMap<>(); 
        for(int i : arr) {
            freq.put(i, freq.getOrDefault(i, 0) + 1); 
        }
        
        PriorityQueue <Integer> pq = new PriorityQueue<>((a, b) -> (b - a));
        
        for (int m : freq.values()) 
        {
            pq.add(m);
        }
        int size = 0; 
        int value = 0; 
        while(!pq.isEmpty() && value < arr.length/2) {
            value+=pq.poll();
            size++;  
        }
        
        return size; 
        
    }
}
