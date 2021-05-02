import java.util.HashSet;

public class Intersection {

    private static int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for (int j : nums1) set.add(j);
        HashSet<Integer> ans = new HashSet<>();
        for (int j : nums2) {
            if (set.contains(j))
                ans.add(j);
        }
        int[] ansArray = new int[ans.size()];
        int i = 0;
        for(int num : ans) {
            ansArray[i++] = num;
        }
        return ansArray;
    }
}
