public class HouseRobber2 {

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 1};
        System.out.println(rob(nums));
    }

    private static int rob(int[] nums) {
        if(nums.length == 1)    return nums[0];
        if(nums.length == 2)    return Math.max(nums[0], nums[1]);

        int with1st = solve(nums, 0, nums.length - 2);
        int withLast = solve(nums, 1, nums.length - 1);
        return Math.max(with1st, withLast);
    }

    private static int solve(int[] nums, int first, int last) {
        if(first == last)
            return nums[first];

        int[] dp = new int[nums.length];
        dp[first] = nums[first];
        dp[first + 1] = Math.max(dp[first], nums[first + 1]);

        for(int i = first + 2; i <= last; i++) {
            dp[i] = Math.max(dp[i - 1], nums[i] + dp[i - 2]);
        }

        return dp[last];
    }
}
