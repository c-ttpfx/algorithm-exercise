package com.ttpfx.剑指Offer专项突击版;

import java.util.HashMap;

/**
 * @author ttpfx
 * @date 2023/1/10
 */
public class 排序数组中两个数字之和 {

    /*
    给定一个已按照 升序排列 的整数数组numbers ，请你从数组中找出两个数满足相加之和等于目标数target 。

    函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 0开始计数 ，
    所以答案数组应当满足 0<= answer[0] < answer[1] <numbers.length。

    假设数组中存在且只存在一对符合条件的数字，同时一个数字不能使用两次。
     */
    public int[] twoSum(int[] numbers, int target) {
        int l = 0;
        int r = numbers.length - 1;
        while (r > l) {
            int sum = numbers[l] + numbers[r];
            if (sum == target) return new int[]{l, r};
            else if (sum > target) r--;
            else l++;
        }
        return null;
    }
}
