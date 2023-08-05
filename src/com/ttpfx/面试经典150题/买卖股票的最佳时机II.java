package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 买卖股票的最佳时机II {

    public int maxProfit(int[] prices) {
        int pre = prices[0];
        int sum = 0;
        for (int price : prices) {
            sum += Math.max(0, price - pre);
            pre = price;
        }
        return sum;
    }
}
