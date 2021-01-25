public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> conA = new HashSet<>(); 
        ListNode answer = null; 
        while(headA!= null) {
            conA.add(headA); 
            headA= headA.next; 
        }
        
        while(headB!= null) {
            if(conA.contains(headB)){
                answer = headB; 
                break; 
            }
            headB = headB.next; 
        }
        
        return answer; 
    }
}
