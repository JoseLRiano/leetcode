package Top150Q;

class Solution {
    public ListNode deleteDuplicates(ListNode head){
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        while(head != null){
            if(head.next != null && head.val == head.next.val){
                while(head.next != null && head.val == head.next.val){
                    head = head.next;
                }
                // skip all the repeated duplicates 
                prev.next = head.next;                
            }else {
                prev = prev.next;
            }
            // move the head forward
            head = head.next;
        }
        return dummy.next;
    }
}
