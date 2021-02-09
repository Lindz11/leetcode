lass Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> min_heap = new PriorityQueue<>(); 
        for(int i: nums){
            min_heap.add(i); 
        }
        
        while(min_heap.size()!=k) {
            min_heap.poll(); 
        }
        
        return min_heap.poll(); 
    }
}
