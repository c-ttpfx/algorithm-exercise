package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/20
 */
public class 盛最多水的容器 {

    public int maxArea(int[] height) {
        int l = 0;
        int r = height.length - 1;
        int max = 0;
        while (l < r) {
            max = Math.max(max, Math.min(height[l], height[r]) * (r - l));
            if (height[l] > height[r]) r--;
            else l++;
        }
        return max;
    }
}
