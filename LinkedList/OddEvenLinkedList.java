class Solution {
    public ListNode oddEvenList(ListNode head) {
        if(head == null)
            return null; 
        ListNode even = head.next; 
        ListNode odd = head.next; 
        ListNode answer = new ListNode(head.val);  
        ListNode iter = answer; 
        int i = 0; 
        while(odd!=null) {
            if( i % 2 == 1) {
                ListNode temp = new ListNode(odd.val); 
                iter.next = temp;
                temp.next = null; 
                iter = iter.next; 
            }
            i++; 
            odd = odd.next; 
        }
        
        int j = 0; 
        while(even!=null) {
            if(j % 2 == 0) {
                ListNode temp = new ListNode(even.val); 
                iter.next = temp;
                temp.next = null; 
                iter = iter.next; 
            }
            j++; 
            even = even.next; 
        }
        
        return answer; 
        
    }
}
