public class DeleteDuplicates2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(3, new ListNode(4, new ListNode(4, new ListNode(5)))))));
        delete(head);
    }

    private static ListNode delete(ListNode head) {
        if(head == null || head.next == null)
            return head;

        ListNode newHead = head;
        ListNode curr = head;
        ListNode temp = head;
        boolean same = false;
        boolean first = true;

        while(temp.next != null) {
            temp = temp.next;

            if(curr.val == temp.val) {
                same = true;
            } else if (first && !same) {
                head = newHead = curr;
                curr = curr.next;
                first = false;
            } else if (!same) {
                newHead.next = curr;
                newHead = newHead.next;
                curr = curr.next;
            } else {
                same = false;
                curr = temp;
            }
        }

        if(first && same)
            return null;
        else if(first)
            return curr;
        else if(same)
            newHead.next = null;
        else
            newHead.next = curr;

        return head;
    }
}
