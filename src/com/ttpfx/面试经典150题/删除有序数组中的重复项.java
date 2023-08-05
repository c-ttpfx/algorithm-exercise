package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 删除有序数组中的重复项 {

    public int removeDuplicates(int[] nums) {
        int p = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[p]) {
                nums[++p] = nums[i];
            }
        }
        return p + 1;
    }
}
