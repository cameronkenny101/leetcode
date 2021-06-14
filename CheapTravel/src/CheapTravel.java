import java.util.Arrays;

public class CheapTravel {

    public static void main(String[] args) {
        int[] days = {1,2,3,4,6,8,9,10,13,14,16,17,19,21,24,26,27,28,29};
        int[] costs = {3,14,59};
        System.out.println(minCostTickets(days, costs));
    }

    public static int minCostTickets(int[] days, int[] costs) {
        int dp[] = new int[days[days.length - 1] + 1];
        Arrays.fill(dp, Integer.MAX_VALUE);
        dp[0] = 0;
        int j = 0;

        for(int i = 1; i <= days[days.length - 1]; i++) {
            int day = 1;
            if(j == days.length)
                break;
            if (days[j] == i) {
                j++;
                for (int cost : costs) {
                    int lb = i - day;
                    if (lb < 0)
                        lb = 0;
                    dp[i] = Math.min(cost + dp[lb], dp[i]);
                    day = day == 1 ? 7 : 30;
                }
            } else {
                dp[i] = dp[i - 1];
            }
        }
        return dp[days[days.length - 1]];
    }
}
