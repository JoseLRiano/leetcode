public class reverseLinkedList {
    public ListNode reverseList(ListNode head){
        // Recursion approach Time Complexity O(n), Space Complexity O(n)
        // if(head == null || head.next == null) return head;

        // ListNode recursiveSubList = reverseList(head.next);
        // head.next.next = head;
        // head.next = null;
        
        // return recursiveSubList;

        
        // Iterative Approach, time Complexity is O(n) and Space complexity is O(1)

        ListNode curr = head, prev = null;

        while(curr != null){
            ListNode currNext = curr.next;
            curr.next = prev;
            prev = curr;
            curr = currNext;
        }
        return prev;
    }
}
