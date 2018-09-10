package ayman.problemsolving.com;

public class BestTimeToBuyAndSellStock2 {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/description/

    public static void main(String... args) {
        int[] prices = new int[]{7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        if (prices == null || prices.length == 0)
            return 0;

        int buy = prices[0];
        int buyIndex = 0;
        int sell = -1;
        int profit = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] <= buy) {
                buy = prices[i];
                sell = -1;
                buyIndex = i;
                System.out.println("Index: " + i + " Buy: " + buy);
            }

            if (prices[i] >= sell && buyIndex < i) {
                sell = prices[i];
                profit += (sell - buy);
                System.out.println("Index: " + i + " Sell: " + sell + " Current Profile: " + (sell - buy) + " Profile: " + profit);
                buy = prices[i];
            }
        }
        return profit;
    }
}
