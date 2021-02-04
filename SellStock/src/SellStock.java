public class SellStock {

    public static void main(String[] args) {
        int[] prices = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 1) {
            return 0;
        }
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;
        for (int num : prices) {
            min_price = Math.min(min_price, num);
            max_profit = Math.max(max_profit, num - min_price);
        }
        return max_profit;
    }
}
