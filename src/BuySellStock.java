// Question : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BuySellStock {
    public static int maxProfit(int[] prices) {
        int buy = 0;
        int sell = 1;
        int max = 0;
        while(sell < prices.length) {
            if(prices[buy] >= prices[sell]) {
                buy = sell;
                sell++;
            }else {
                max = Math.max(max, prices[sell] - prices[buy]);
                sell++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[] array = {7,1,5,3,6,4};
        System.out.println(maxProfit(array));
    }
}
