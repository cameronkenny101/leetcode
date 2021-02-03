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
            ListNode answer = new ListNode();
            ListNode head = answer;
            boolean carry = false;
            boolean listOne = true;
            boolean listTwo = true;
            int digit = 0;
            while (listOne || listTwo || carry) {
                if(listOne)
                    digit += l1.val;
                if(listTwo)
                    digit += l2.val;
                if(carry)
                    digit +=1;

                if(digit >= 10) {
                    carry = true;
                    digit %= 10;
                } else
                    carry = false;

                answer.val = digit;
                if(l1.next != null)
                    l1 = l1.next;
                else
                    listOne = false;
                if(l2.next != null)
                    l2 = l2.next;
                else
                    listTwo = false;
                if(listOne || listTwo || carry) {
                    answer.next = new ListNode();
                    answer = answer.next;
                }
                digit = 0;
            }
            return head;
    }
}
