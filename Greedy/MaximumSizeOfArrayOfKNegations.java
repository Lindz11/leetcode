class Solution {
    public int largestSumAfterKNegations(int[] A, int K) {
        PriorityQueue <Integer> queue = new PriorityQueue<Integer>(); 
        // Put everything into the priority queue
        for(int i: A) 
        {
            queue.add(i); 
        } 
        
        // While K is greater than 0
        while( K > 0) 
        {
            // If we encounter a 0 then break
            if(queue.peek() == 0)
                break; 
            queue.add(-queue.poll());
            K--; 
        }
        
        int sum = 0;  
        int length = queue.size(); 
        for( int j = 0; j < length; j++){
            sum+=queue.poll(); 
        }
       
        
        return sum; 
    }
}
