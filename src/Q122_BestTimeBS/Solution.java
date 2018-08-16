package Q122_BestTimeBS;

public class Solution {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int ans = maxProfit(prices);
        System.out.println(ans);
    }

    public static int maxProfit(int[] prices) {
        int total = 0;
        for (int i = 0; i < prices.length - 1; i++) {
            if (prices[i + 1] > prices[i]) {
                total += prices[i + 1] - prices[i];
            }
        }
        return total;
    }
}
