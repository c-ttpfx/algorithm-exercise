package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 跳跃游戏II {

    public int jump(int[] nums) {
        if (nums.length <= 1)return 0;
        int step = 0;
        int maxDis = 0;
        int end = -1;
        while (true){
            int start = end+1;
            end = maxDis;
            for (int i = start; i <= end; i++) {
                maxDis = Math.max(maxDis,i + nums[i]);
            }
            step++;
            if (maxDis >= nums.length-1)break;
        }
        return step;
    }

    public static void main(String[] args) {
        int[] nums = {2,3,1,1,4};
        int jump = new 跳跃游戏II().jump(nums);
        System.out.println(jump);
    }
}
