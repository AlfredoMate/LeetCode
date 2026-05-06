class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for (int price : prices) {
            if (price < min_price){
                min_price = price;
            } else {
                max_profit = Math.max(max_profit, price-min_price);
            }
        }
        return max_profit;
    }

    public int maxProfitTwoPointers(int[] prices) {
        int right = 1, left = 0;
        int max_profit = 0;

        while (right < prices.length) {
            if (prices[left] < prices[right]) {

                max_profit = Math.max(max_profit, prices[right] - prices[left]);
                right++;
            } else {
                left = right;
                right++;
            }
        }
        return max_profit;

    }
}