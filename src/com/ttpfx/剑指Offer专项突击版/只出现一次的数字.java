package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/1/8
 */
public class 只出现一次的数字 {

    /*
    给你一个整数数组 nums ，除某个元素仅出现 一次 外，其余每个元素都恰出现 三次 。
    请你找出并返回那个只出现了一次的元素。O(n)复杂度，不使用额外空间
     */

    public int singleNumber(int[] nums) {
        int ans = 0;
        for (int i = 0; i < 32; i++) {
            int sum = 0;
            for (int num : nums) sum += ((num >> i) & 1);
            if (sum % 3 != 0) ans |= (1 << i);
        }
        return ans;
    }
}
