package Q121_StockTrade;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }

        int max_profit = 0, min_price = prices[0];
        for (int i = 0; i < prices.length; i++) {
            min_price = Math.min(prices[i], min_price);
            int profit = prices[i] - min_price;
            max_profit = Math.max(profit, max_profit);
        }
        return max_profit;

//        int maxCur = 0, maxSoFar = 0;
//        for (int i = 1; i < prices.length; i++) {
//            maxCur = Math.max(0, maxCur += (prices[i] - prices[i - 1]));
//            maxSoFar = Math.max(maxCur, maxSoFar);
//        }
//        return maxSoFar;
    }
}

