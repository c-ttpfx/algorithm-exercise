package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 买卖股票的最佳时机 {

    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;
        for (int price : prices) {
            min = Math.min(min, price);
            ans = Math.max(ans, price - min);
        }
        return ans;
    }
}
