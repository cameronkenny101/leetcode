import java.util.HashMap;

public class LRUCache {
    HashMap<Integer, dlist> hmap;
    int size, cursz;
    dlist head, tail;

    class dlist {
        int val, key;
        dlist next;
        dlist prev;

        public dlist(int key, int val) {
            this.val = val;
            this.key = key;
            this.next = null;
            this.prev = null;
        }
    }

    public LRUCache(int capacity) {
        hmap = new HashMap<>(capacity);
        head = new dlist(-1, -1);
        tail = head;
        cursz = 0;
        size = capacity;
    }

    public int get(int key) {
        if (size == 0) return -1;
        if (hmap.containsKey(key)) {
            dlist l = hmap.get(key);
            /* If resource is not at head, insert it at head */
            if(head.next != l) {
                removeElement(l);
                insertHead(l);
            }
            return l.val;
        }
        return -1;
    }

    public void put(int key, int value) {
        if (size == 0) return;
        /* Update the resource if it already present */
        if (hmap.containsKey(key)) {
            dlist l = hmap.get(key);
            l.val = value;
            if(head.next != l) {
                removeElement(l);
                insertHead(l);
            }
            return;
        }

        /* If capacity is reached, remove the resource from tail */
        if (cursz == size) {
            removeTail();
            cursz--;
        }
        dlist l = new dlist(key, value);
        insertHead(l);
        hmap.put(key, l);
        cursz++;
    }

    private void insertHead(dlist l) {
        dlist next = head.next;
        head.next = l;
        l.prev = head;
        l.next = next;
        if (next != null)
            next.prev = l;

        if (head == tail)
            tail = l;


    }

    private void removeTail() {
        hmap.remove(tail.key);
        dlist prev = tail.prev;
        tail.prev = null;
        tail = prev;
        tail.next = null;
    }

    private void removeElement(dlist l) {
        if (tail == l)
            tail = l.prev;

        l.prev.next = l.next;
        if (l.next != null)
            l.next.prev = l.prev;
        l.next = null;
        l.prev = null;
    }

    private void display() {
        dlist temp = head;
        while(temp!=null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
    }
}
