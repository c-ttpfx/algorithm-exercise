package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

/**
 * @author ttpfx
 * @date 2023/1/10
 */
public class 和大于等于target的最短子数组 {

    /*
    给定一个含有n个正整数的数组和一个正整数 target 。

    找出该数组中满足其和 ≥ target 的长度最小的 连续子数组nums[l], nums[l+1], ..., nums[r-1], nums[r] ，
    并返回其长度。如果不存在符合条件的子数组，返回 0 。
     */
    //个人思路，滑动窗口
    public int minSubArrayLen(int target, int[] nums) {
        int l = 0;
        int r = 1;
        int sum = nums[0];
        int min = Integer.MAX_VALUE;
        while (l < r) {
            if (sum >= target) {
                while (sum >= target && l < r) {
                    sum -= nums[l++];
                }
                min = Math.min(min, r - l + 1);
            }
            if (r >= nums.length) break;
            sum += nums[r++];
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }

    @Test
    public void test(){
        int[] nums = {1,2,3,4,5};
        int len = minSubArrayLen(15, nums);
        System.out.println(len);
    }
}
