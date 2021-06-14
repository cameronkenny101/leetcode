public class Change {

    public static void main(String[] args) {
        int[] coins = {186,419,83,408};
        System.out.println(coinChange(coins, 6249));
    }

    public static int coinChange(int[] coins, int amount) {
        int count = 0;
        while (amount > 0) {
            int maxCoin = 0;
            for(int i = 0; i < coins.length; i++) {
                if (coins[i] <= amount && coins[i] > maxCoin)
                    maxCoin = coins[i];
            }
            if(maxCoin == 0)
                return -1;
            count += amount / maxCoin;
            amount %= maxCoin;
        }
        return count;
    }
}
