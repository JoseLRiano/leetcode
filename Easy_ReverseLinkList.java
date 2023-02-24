// Definition for sigly-linked list.
public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val){ this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class ReverseLinkList {
    public ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            Listnode next = curr.next;
            current.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}