package com.ttpfx.面试经典150题;

import java.util.Arrays;

/**
 * @author ttpfx
 * @date 2023/5/14
 */
public class 除自身以外数组的乘积 {

    public int[] productExceptSelf(int[] nums) {
        int[] ans = new int[nums.length];
        ans[ans.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) {
            ans[i] = ans[i + 1] * nums[i];
        }
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i - 1] * nums[i];
        }
        ans[0] = ans[1];
        for (int i = 1; i < ans.length - 1; i++) {
            ans[i] = nums[i - 1] * ans[i + 1];
        }
        ans[ans.length - 1] = nums[ans.length - 2];
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {1,2,3,4};
        int[] ints = new 除自身以外数组的乘积().productExceptSelf(nums);
        System.out.println(Arrays.toString(ints));
    }
}
