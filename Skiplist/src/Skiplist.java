import java.util.Random;

public class Skiplist {
    
    static class Node {
        int val;
        int count;
        int highestLevel;
        Node[] next;

        public Node(int a, int b) {
            val = a;
            highestLevel = b;
            next = new Node[33];
        }
    }

    Node sentinal = new Node(Integer.MIN_VALUE, 32);
    int topLevel = 0;
    Node[] stack = new Node[33];
    Random rand = new Random();

    private Node findPrev(int num) {
        Node cur = sentinal;
        for(int i = topLevel; i >= 0; i--) {
            while (cur.next[i] != null && cur.next[i].val < num) {
                cur = cur.next[i];
            }
            stack[i] = cur;
        }
        return cur;
    }

    public boolean search(int target) {
        Node prev = findPrev(target);
        return prev.next[0] != null && prev.next[0].val == target;
    }

    private int pickHeight() {
        return Integer.numberOfTrailingZeros(rand.nextInt());
    }

    public void add(int num) {
        Node prev = findPrev(num);
        if(prev.next[0] != null && prev.next[0].val == num) {
            prev.next[0].count++;
            return;
        }
        Node newNode = new Node(num, pickHeight());
        while (topLevel < newNode.highestLevel) {
            stack[++topLevel] = sentinal;
        }
        for(int i = 0; i <= newNode.highestLevel; i++) {
            newNode.next[i] = stack[i].next[i];
            stack[i].next[i] = newNode;
        }
    }

    public boolean erase(int num) {
        Node prev = findPrev(num);
        if(prev.next[0] == null || prev.next[0].val != num)
            return false;
        if(prev.next[0].count > 1) {
            --prev.next[0].count;
            return true;
        }

        for(int i = topLevel; i >= 0; i--) {
            Node cur = stack[i];
            if(cur.next[i] != null && cur.next[i].val == num) {
                cur.next[i] = cur.next[i].next[i];
            }
        }
        return true;
    }
}
