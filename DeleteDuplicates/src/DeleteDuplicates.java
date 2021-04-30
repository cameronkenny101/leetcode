public class DeleteDuplicates {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }

        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    private static ListNode delete(ListNode head) {
        if(head == null)
            return null;
        ListNode oldHead = head;
        ListNode temp = head;
        while(temp.next != null) {
            temp = temp.next;
            if(head.val != temp.val) {
                head.next = temp;
                head = head.next;
            }
        }
        head.next = null;
        return oldHead;
    }
}
