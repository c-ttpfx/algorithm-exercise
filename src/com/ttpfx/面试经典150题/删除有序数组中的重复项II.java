package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 删除有序数组中的重复项II {

    public int removeDuplicates(int[] nums) {
        if (nums.length <= 2) return nums.length;
        int p = nums[0] == nums[1] ? 1 : 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[p] || nums[i] != nums[p - 1]) {
                nums[++p] = nums[i];
            }
        }
        return p + 1;
    }
}
