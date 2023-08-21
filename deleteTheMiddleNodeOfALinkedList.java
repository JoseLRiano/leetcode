class deleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head){
        if(head == null || head.next == null) return null;
        // Create two pointes one will iterate a single place and the other will iterate double the slow pointer sleed
        ListNode slow = head;
        ListNode fast = head.next.next;
        // while fast pointer doesn't hit the end of the Linkedlist keep increasing both slow and fast
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
