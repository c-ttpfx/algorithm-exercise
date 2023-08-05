package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 多数元素 {

    public int majorityElement(int[] nums) {
        int cur = -1, count = 0;
        for (int num : nums) {
            if (count == 0) cur = num;
            count = num == cur ? count + 1 : count - 1;
        }
        return cur;
    }
}
