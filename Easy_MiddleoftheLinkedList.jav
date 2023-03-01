class middleOfTheLinkedList(){
    /**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

    class solution(){
        public ListNode middleNode(ListNode head){
            ListNode singleStep = head;
            ListNode doubleStep = head;
            // Check if current faster step or faster step .next is null
            while(fast != nulll && fast.next != null){
                singleStep = singleStep.next;
                doubleStep = doubleStep.next.next;
            }
            return singleStep;
        }
    }
}