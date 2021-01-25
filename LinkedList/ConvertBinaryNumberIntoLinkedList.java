class Solution {
    public int getDecimalValue(ListNode head) {
        // If the head of the list we are given is null return 0
        if(head == null)
            return 0; 
        String num = "";
        // While the head is not equal to null just traverse through the list
        while(head!=null){
            num+=head.val; 
            head=head.next; 
        }
        int answer = Integer.parseInt(num, 2); 
        return answer; 
    }
}
