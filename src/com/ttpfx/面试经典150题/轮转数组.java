package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 轮转数组 {

    public void rotate(int[] nums, int k) {
        int start = 0;
        int count = 0;
        k %= nums.length;
        if (k == 0) return;
        while (count != nums.length) {
            int p = start;
            int preV = nums[p];
            do {
                p = (p + k) % nums.length;
                int t = nums[p];
                nums[p] = preV;
                preV = t;
                count++;
            } while (p != start);
            start++;
        }
    }
}
