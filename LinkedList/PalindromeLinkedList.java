class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null)
            return true; 
        StringBuilder sb = new StringBuilder();
        StringBuilder ab = new StringBuilder();
        while(head!=null) {
            sb.append(head.val); 
            ab.insert(0, head.val); 
            head = head.next; 
        } 
        
        if(sb.toString().equals(ab.toString()))
            return true; 
        return false; 
    }
}
