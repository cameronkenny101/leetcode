import java.util.Arrays;

public class Change {

    public static void main(String[] args) {
        int[] coins = {1};
        System.out.println(coinChange(coins, 2));
    }

    public static int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, amount + 1);
        dp[0] = 0;
        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(coin <= i) {
                    dp[i] = Math.min(1 + dp[i - coin], dp[i]);
                }
            }
        }
        return dp[amount] == amount + 1 ? -1 : dp[amount];

    }
}
