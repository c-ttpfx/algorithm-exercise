package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/1/10
 */
public class 乘积小于K的子数组 {

    /*
    给定一个正整数数组 nums和整数 k ，请找出该数组内乘积小于 k 的连续的子数组的个数。
     */

    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int l = 0;
        int r = 1;
        int product = nums[0];
        int sum = 0;
        while (l < r) {
            while (product >= k && l < r) product /= nums[l++];
            if (product < k) sum += r - l;
            if (r >= nums.length) break;
            product *= nums[r++];
        }
        return sum;
    }
}
