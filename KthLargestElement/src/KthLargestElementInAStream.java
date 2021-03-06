import java.util.PriorityQueue;

public class KthLargestElementInAStream {

    PriorityQueue<Integer> pq = new PriorityQueue<>();
    private final int k;

    public KthLargestElementInAStream(int k, int[] nums) {
        this.k = k;
        for (int num : nums) {
            pq.add(num);
            if (pq.size() > k)
                pq.poll();
        }
    }

    public int add(int val) {
        pq.add(val);
        if(pq.size() > k)
            pq.poll();
        return pq.peek();
    }
}
