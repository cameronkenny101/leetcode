public class SwapNodes {

    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public ListNode swapNode(ListNode head, int k) {
        if(head.next == null)
            return head;
        int length = 0, firstVal = 0;
        ListNode curr = head, first = head;

        while(curr != null) {
            if(length == k)
                first = curr;
            length++;
            curr = curr.next;
        }

        int end = length - k;
        int i = 0;
        curr = head;
        while (i < end) {
            curr = curr.next;
            i++;
        }
        first.val = curr.val;
        curr.val = firstVal;
        return head;
    }


}
