package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/1/8
 */
public class 前n个数字二进制中1的个数 {

    /*
    给定一个非负整数 n ，请计算 0 到 n 之间的每个数字的二进制表示中 1 的个数，并输出一个数组。
     */

    /**
     * i 为奇数时，dp[i] = dp[i-1] + 1
     * i 为偶数时，dp[i] = dp[i/2]
     * 可以合并一下，因为i为偶数，最后一位一定为0，左移不会影响1的个数，所以dp[i]=dp[i>>1]
     * 当i为奇数，可以理解为dp[i] = dp[i>>1]+1，例如1111 左移1位后为 111 ，我们只需要加上最后一个1即可
     * 最后合并了就是dp[i] = dp[i>>1] + (i&1)
     *
     * @param n
     * @return
     */
    public int[] countBits(int n) {
        int[] nums = new int[n + 1];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i >> 1] + (i & 1);
        }
        return nums;
    }
}
