public class LIS {

    public static void main(String[] args) {
        int[] arr = {10,9,2,5,3,7,101,18};
        System.out.println(dpLIS(arr));
    }

    private static int dpLIS(int[] arr) {
        int[] dp = new int[arr.length];
        dp[0] = 1;
        int max = 0;
        for(int i = 1; i < arr.length; i++) {
            dp[i] = 1;
            for(int j = 0; j < i; j++) {
                if(arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                    if(dp[i] > max)
                        max = dp[i];
                }
            }
        }
        return max;
    }
}
