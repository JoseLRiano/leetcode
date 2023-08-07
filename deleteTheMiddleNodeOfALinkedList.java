class deleteTheMiddleNodeOfALinkedList {
    public ListNode deleteMiddle(ListNode head){
        if(head == null || head.next == null) return null;
        ListNode slow = head;
        ListNode fast = head.next.next;
        while(fast.next != null && fast.next.next != null){
            slow = solw.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        return head;
    }
}
