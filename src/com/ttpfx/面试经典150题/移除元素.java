package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/13
 */
public class 移除元素 {

    public int removeElement(int[] nums, int val) {
        int p1 = 0,p2 = nums.length-1;
        while (p1 < p2){
            if (nums[p1] == val){
                while (p2>=0 && nums[p2]==val)p2--;
                if (p2 < 0 || p1 >= p2)break;
                nums[p1] = nums[p2--];
            }
            p1++;
        }
        return p1;
    }
}
