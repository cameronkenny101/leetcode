public class AddTwoNumbers {

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {};
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }

    static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode answer = new ListNode();
        boolean carry = false;
        int digit;
        while (l1.next != null && l2.next != null && !carry) {
            if(carry)
                digit = l1.val + l2.val + 1;
            else
                digit = l1.val + l2.val;

            if(digit > 10) {
                carry = true;
                digit %= 10;
            } else
                carry = false;

            answer.val = digit;
            answer.next = new ListNode();
            answer = answer.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        return answer;
    }
}
