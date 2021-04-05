public class Remove {

    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        System.out.println(removeNode(head, 0));
    }

    private static ListNode removeNode(ListNode head, int n) {
        if(head.next == null)
            return null;
        int length = 0;
        ListNode curr = head;

        while(curr != null) {
            length++;
            curr = curr.next;
        }

        int remove = length - n;
        if(remove == 0)
            return head.next;
        int i = 0;
        curr = head;
        while (i != remove) {
            curr = curr.next;
            i++;
        }
        curr.next = curr.next.next;
        return head;
    }
}
