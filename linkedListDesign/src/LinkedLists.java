public class LinkedLists {

    static class Node {
        Node next = null;
        int val = 0;

        public Node(int v) {
            val = v;
        }
    }

    static class MyLinkedList {
        private Node head = null;
        private Node tail = null;
        private int size = 0;

        /** Get the value of the index-th node in the linked list. If the index is invalid, return -1. */
        public int get(int index) {
            if (index < 0 || index >= size) {
                return -1;
            }
            Node curr = head;
            for (int i = 0; i < index; i++) {
                curr = curr.next;
            }
            return curr.val;
        }

        /** Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list. */
        public void addAtHead(int val) {
            Node newHead = new Node(val);
            if(size == 0) {
                head = newHead;
                tail = newHead;
            } else {
                newHead.next = head;
                head = newHead;
            }
            size++;
        }

        /** Append a node of value val to the last element of the linked list. */
        public void addAtTail(int val) {
            Node newTail = new Node(val);
            if(size == 0) {
                head = newTail;
                tail = newTail;
            } else {
                tail.next = newTail;
                tail = newTail;
            }
            size++;
        }

        /** Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted. */
        public void addAtIndex(int index, int val) {
            if(index > size) {
                return;
            } else if(index == size) {
                addAtTail(val);
            } else if(index == 0) {
                addAtHead(val);
            } else {
                Node newNode = new Node(val);
                Node curr = head;
                for(int i = 0; i < index - 1; i++) {
                    curr = curr.next;
                }
                newNode.next = curr.next;
                curr.next = newNode;
                size++;
            }
        }

        /** Delete the index-th node in the linked list, if the index is valid. */
        public void deleteAtIndex(int index) {
            if(index >= size)
                return;
            else if(index == 0) {
                head = head.next;
                size--;
            }
            else {
                Node curr = head;
                for(int i = 0; i < index - 1; i++) {
                    curr = curr.next;
                }
                if(curr.next == tail)
                    tail = curr;
                curr.next = curr.next.next;
                size--;
            }
        }
    }
}
