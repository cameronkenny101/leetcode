class Solution{

    public class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode prev = head;
        ListNode curr = head.next;
        ListNode traverse = head.next.next;

        while(traverse != null) {
            curr.next = prev;
            prev = curr;
            curr = traverse;
            traverse = traverse.next;
        }

        curr.next = prev;
        head.next = null;
        head = curr;

        return head;

    }
}
