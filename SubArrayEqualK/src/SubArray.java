public class SubArray {

    public static void main(String[] args) {
        int[] nums = {1,2,3};
        System.out.println(subarraySum(nums, 3));
    }

    private static int subarraySum(int[] nums, int k) {
        int count = 0;
        int ans = 0;
        for(int i = 0; i < nums.length; i++) {
            count = nums[i];
            if(count == k)
                ans++;
            for(int j = i + 1; j < nums.length; j++) {
                count += nums[j];
                if(count == k)
                    ans++;
            }
        }
        return ans;
    }
}
