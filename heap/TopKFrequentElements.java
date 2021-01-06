class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int length = nums.length;
        HashMap <Integer, Integer> frequency = new HashMap<>(); 
        // Calculate the frequency of everything in the array 
        for(int i = 0 ; i < length; i++){
            if(!frequency.containsKey(nums[i]))
                frequency.put(nums[i], 1); 
            else 
                frequency.put(nums[i], frequency.get(nums[i]) + 1);
        }
        // Make a priority queue of max heap that gets the keys and compares the values larget at the top
        PriorityQueue<Map.Entry<Integer, Integer>> queue = new PriorityQueue<>((k1, k2) -> k2.getValue() - k1.getValue());
        for(Map.Entry<Integer, Integer> entry: frequency.entrySet()){
            queue.add(entry);   
        }
        
        // The lambda expression uses a compare to method to test which values are greater than others in the hashmap and 
        // have the greatest keys/values on top and the lowest keys/values on the bottom 
        // (a,b) -> b - a = max; 
        // (a,b) -> a - b = min; 
        
        int [] answer = new int [k]; 
        int i= 0; 
        
        // We only want the two largest keys from the hashmap 
        while( i < k){
            answer[i] = queue.poll().getKey();
            i++;
        }
        
        return answer; 
       
    }
}
