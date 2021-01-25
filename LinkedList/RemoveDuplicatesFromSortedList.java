class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        HashSet<Integer> dups = new HashSet<>();
        ListNode previous = head;  
        ListNode temp = head; 
        while(head!=null) {
            if(dups.contains(head.val)){
                previous.next = head.next;
                head = head.next; 
                continue; 
            }
            previous = head; 
            dups.add(head.val); 
            head = head.next; 
             
        }
        
        return temp; 
    }
}
