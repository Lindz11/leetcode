class Solution {
    public int[] frequencySort(int[] nums) {
        Map<Integer, Integer> freq = new HashMap<>(); 
        for(int i: nums) {
            freq.put(i, freq.getOrDefault(i,0) + 1); 
        }
        
       PriorityQueue<Integer> pq = new PriorityQueue<>(
                (x, y) -> freq.get(x) == freq.get(y) ? y - x : freq.get(x) - freq.get(y));

        for (int num : nums) {
            pq.offer(num);
        }

        int[] answer = new int[nums.length];
        int i = 0;
        while (!pq.isEmpty()) {
            nums[i++] = pq.poll();
        }
        return nums;
    }
}
