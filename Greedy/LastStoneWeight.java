class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> s = new ArrayList<>(); 
        // Turn our min heap into a max heap 
        PriorityQueue<Integer> queue = new PriorityQueue<Integer>(stones.length, Collections.reverseOrder()); 
        // Add everything into our priority queue
        for(int j : stones) {
            queue.add(j); 
        }
        
        while(queue.size() > 1){
            int x = queue.poll();
            System.out.println(x); 
            int y = queue.poll(); 
            if(x != y)
                queue.add(Math.abs(x - y)); 
        }
        
        // If the heap is empty then return 0
        if(queue.isEmpty())
            return 0; 
        
        // Else return the last thing in the heap 
        return queue.poll(); 
    }
}
