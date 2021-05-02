import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestPairs {

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<List<Integer>> maxHeap = new PriorityQueue<>((a, b) -> Integer.compare((b.get(0) + b.get(1)), (a.get(0) + a.get(1))));

        for(int i : nums1) {
            for(int j : nums2) {
                maxHeap.add(List.of(i, j));
                if(maxHeap.size() > k)
                    maxHeap.remove();
            }
        }
        List<List<Integer>> result = new ArrayList<>();
        while(!maxHeap.isEmpty()) {
            result.add(maxHeap.remove());
        }
        return result;
    }

}
