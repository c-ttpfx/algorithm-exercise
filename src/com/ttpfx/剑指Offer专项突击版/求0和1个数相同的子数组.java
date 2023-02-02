package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * @author ttpfx
 * @date 2023/1/11
 */
public class 求0和1个数相同的子数组 {

    /*
    给定一个二进制数组 nums , 找到含有相同数量的 0 和 1 的最长连续子数组，并返回该子数组的长度。
     */
    public int findMaxLength(int[] nums) {
        int max = 0;
        int preSum = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            preSum += nums[i] == 0 ? -1 :1;
            if (preSum == 0) max = i + 1;
            else if (hashMap.containsKey(preSum)) max = Math.max(max, i - hashMap.get(preSum));
            else hashMap.put(preSum, i);
        }
        return max;
    }

    @Test
    public void test() {
        int[] nums = {0,1,1,0,1,1,1,0};
        System.out.println(findMaxLength(nums));
    }
}
