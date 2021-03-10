class Solution {
    // For this questions I am thinking of using a priority queue to keep track of every node value that we see 
    // Popping it until it is empty and then adding it to our new LinkedList
    // Creating the linklist as we go with the queue 
    public ListNode sortList(ListNode head) {
        PriorityQueue<Integer> pq= new PriorityQueue<>(); 
        if(head == null)
            return null; 
        ListNode temp = head; 
            while(temp!=null) {
                pq.add(temp.val); 
                temp = temp.next; 
            } 
        ListNode ans = new ListNode(); 
        ListNode start = ans; 
        while(!pq.isEmpty()) {
            int value = pq.poll(); 
            ans.next = new ListNode(value); 
            ans = ans.next; 
        }
        return start.next; 
    }
}
