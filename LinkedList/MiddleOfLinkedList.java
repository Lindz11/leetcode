class Solution {
    public ListNode middleNode(ListNode head) {
        if(head == null)
            return head;
        ListNode temp = head; 
        int length = 0; 
        while(temp!=null){
            temp = temp.next; 
            length++; 
        }
        int middle = 1; 
        ListNode answer = null;  
        while(head!=null){
            if(middle > length/2){
                answer = head;
                break; 
            } 
            head = head.next; 
            middle++; 
        }
        
        return answer; 
    }
}
