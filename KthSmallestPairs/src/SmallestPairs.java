import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class SmallestPairs {

    public static void main(String[] args) {
        int[] num1 = {1, 5, 5};
        int[] num2 = {2, 3, 7};

        kSmallestPairs(num1, num2, 4);
    }

    public static List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<int[]> minHeap = new PriorityQueue<>((a, b) -> Integer.compare(a[2], b[2]));

        for(int i = 0; i < Math.min(nums1.length, k); i++)
            minHeap.add(new int[] {nums1[i], 0, nums1[i] + nums2[0]});
        List<List<Integer>> result = new ArrayList<>();
        while(!minHeap.isEmpty() && k-- > 0) {
            int[] pair = minHeap.poll();
            result.add(Arrays.asList(pair[0], nums2[pair[1]]));

            if(pair[1] < nums2.length - 1)
                minHeap.add(new int[] {pair[0], pair[1] + 1, pair[0] + nums2[pair[1] + 1]});
        }
        return result;

    }

}
