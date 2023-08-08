import java.util.List;

public class maximumTwinSumofaLinkedList {
    public int pairSum(ListNode head){
        // using an Array List.
        // List<Integer> arr = new ArrayList<>();
        // ListNode cur = head;
        // while(cur != null){
        //     arr.add(cur.val);
        // }

        // int i = 0;
        // int j = arr.size();
        // int maxSum = 0;
        // while(i < j){
        //     maxSum = Math.max(maxSum, arr.get(i) + arr.get(j));
        //     i++;
        //     j--;
        // }
        // return maxSum;

        // Reverse half of the LinkedList
        // Get the middle of the LinkedList

        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode nextNode, prev = null;

        while(slow != null){
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // prev will hold the the head of the reverse LinkedList

        // add up both head and compare each result 

        int maxSum = 0;
        ListNode cur = head;
        while(prev != null){
            maxSum = Math.max(maxSum, cur.val + prev.val);
            prev = prev.next;
            cur = cur.next;
        }

        return maxSum;
    }
    
}
