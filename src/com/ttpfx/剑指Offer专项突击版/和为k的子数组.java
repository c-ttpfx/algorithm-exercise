package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

import java.util.HashMap;

/**
 * @author ttpfx
 * @date 2023/1/10
 */
public class 和为k的子数组 {

    /*
    给定一个整数数组和一个整数 k ，请找到该数组中和为 k 的连续子数组的个数。
     */
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int pre = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        hashMap.put(0, 1);
        for (int num : nums) {
            pre += num;
            if (hashMap.containsKey(pre - k)) {
                count += hashMap.get(pre - k);
            }
            hashMap.put(pre, hashMap.getOrDefault(pre, 0) + 1);
        }
        return count;
    }

    @Test
    public void test() {
        int[] nums = {1, 2, 3};
        int count = subarraySum(nums, 3);
        System.out.println(count);
    }
}
