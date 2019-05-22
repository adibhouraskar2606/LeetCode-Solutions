class Solution {
    public int maxProfit(int[] prices) {
        if(prices.length == 0){
            return 0;
        }
        int hypoProfit = 0;
        int buy = prices[0];
        for (int i = 0; i < prices.length; i++) {
            if(prices[i]<buy){
                buy = prices[i];
            }else if(hypoProfit<prices[i]-buy){
                hypoProfit = prices[i] - buy;
            }

        }
        return hypoProfit;
    }
}