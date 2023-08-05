package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 跳跃游戏 {

    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i <= max && max < nums.length - 1; i++) {
            max = Math.max(max, i + nums[i]);
        }
        return max >= nums.length - 1;
    }
}
