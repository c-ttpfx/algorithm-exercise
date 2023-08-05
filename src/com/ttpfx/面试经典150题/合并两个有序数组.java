package com.ttpfx.面试经典150题;

import java.util.Arrays;

/**
 * @author ttpfx
 * @date 2023/5/12
 */
public class 合并两个有序数组 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p = m + n - 1;
        m--;
        n--;
        while (p >= 0) {
            if (m < 0) {
                while (p >= 0) nums1[p--] = nums2[n--];
                break;
            }
            if (n < 0) {
                while (p >= 0) nums1[p--] = nums1[m--];
                break;
            }
            if (nums1[m] > nums2[n]) nums1[p--] = nums1[m--];
            else nums1[p--] = nums2[n--];
        }
    }
}
