import java.util.HashMap;



public class LinkedListCycle2 {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }

    public ListNode detectCycle(ListNode head) {
        if(head == null)
            return null;
        HashMap<Integer, ListNode> map = new HashMap<>();
        int index = 0;
        while (head.next != null) {
            if(map.containsValue(head))
                return head;
            map.put(index, head);
            head = head.next;
            index++;
        }
        return null;
    }
}
