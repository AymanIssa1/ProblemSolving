package ayman.problemsolving.com;

public class BestTimeToBuyAndSellStock {

    // https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

    public static void main(String... args) {
        int[] prices = new int[]{3,2,6,5,0,3};
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
                if ((sell - buy) > profit)
                    profit = sell - buy;
                System.out.println("Index: " + i + " Sell: " + sell + " Profile: " + profit);
            }
        }
        return profit;
    }

}
