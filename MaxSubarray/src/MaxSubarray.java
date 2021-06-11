public class MaxSubarray {

    private static int maxSubArray(int[] nums) {
        int prev = nums[0];
        int max = prev;

        for(int i = 1; i < nums.length; i++) {
            prev = Math.max(nums[i], prev + nums[i]);
            if(prev > max)
                max = prev;
        }
        return max;
    }
}
