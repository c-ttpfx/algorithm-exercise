package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/20
 */
public class 两数之和II输入有序数组 {

    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (l < r) {
            int sum = numbers[l] + numbers[r];
            if (sum < target) l++;
            else if (sum > target) r--;
            else break;
        }
        return new int[]{l, r};
    }
}
