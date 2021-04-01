import java.util.ArrayList;

public class PalindromeLinkedList {

    public static class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(1, new ListNode(2, new ListNode(1))));
        System.out.println(isPalindrome(head));
    }

    private static boolean isPalindrome(ListNode node) {
        ArrayList<Integer> list = new ArrayList<>();
        while(node != null) {
            list.add(node.val);
            node = node.next;
        }

        for(int i = 0, j = list.size() - 1; i <= j; i++, j--) {
            if(list.get(i) == list.get(j))
                continue;
            else
                return false;
        }

        return true;
    }
 }
