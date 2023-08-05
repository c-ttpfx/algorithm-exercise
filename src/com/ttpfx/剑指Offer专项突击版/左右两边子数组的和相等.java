package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * @author ttpfx
 * @date 2023/1/12
 */
public class 左右两边子数组的和相等 {

    /*
    给你一个整数数组nums ，请计算数组的 中心下标 。
    数组 中心下标 是数组的一个下标，其左侧所有元素相加的和等于右侧所有元素相加的和。
    如果中心下标位于数组最左端，那么左侧数之和视为 0 ，因为在下标的左侧不存在元素。
    这一点对于中心下标位于数组最右端同样适用。
    如果数组有多个中心下标，应该返回 最靠近左边 的那一个。如果数组不存在中心下标，返回 -1 。
     */
    public int pivotIndex(int[] nums) {
        int[] pre = new int[nums.length];
        pre[0] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            pre[i] = pre[i - 1] + nums[i];
        }
        int sum = pre[pre.length - 1];
        for (int i = 0; i < pre.length; i++) {
            if (sum - pre[i] == pre[i] - nums[i]) return i;
        }
        return -1;
    }

    @Test
    public void test() {
        int[] nums = {-1,-1,-1,1,1,1};
        System.out.println(pivotIndex(nums));
    }
}
