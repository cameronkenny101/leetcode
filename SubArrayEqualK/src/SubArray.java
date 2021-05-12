import java.util.HashMap;

public class SubArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums, 3));
    }

    private static int subarraySum(int[] nums, int k) {
        int count = 0;
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);

        for(int i = 0; i < nums.length; i++) {
            count += nums[i];

            if(map.containsKey(count - k))
                ans += map.get(count - k);

            map.put(count, map.getOrDefault(count, 0) + 1);

        }
        return ans;
    }
}
