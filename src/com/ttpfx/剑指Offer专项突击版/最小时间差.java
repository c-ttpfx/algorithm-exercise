package com.ttpfx.剑指Offer专项突击版;

import java.util.Arrays;
import java.util.List;

/**
 * @author ttpfx
 * @date 2023/2/1
 */
public class 最小时间差 {

    /*
    给定一个 24 小时制（小时:分钟 "HH:MM"）的时间列表，找出列表中任意两个时间的最小时间差并以分钟数表示。
     */
    public int findMinDifference(List<String> timePoints) {
        if (timePoints.size() > 1440) return 0;
        int[] nums = new int[timePoints.size()];
        for (int i = 0; i < timePoints.size(); i++) {
            nums[i] = Integer.parseInt(timePoints.get(i).substring(0, 2)) * 60
                    + Integer.parseInt(timePoints.get(i).substring(3));
        }
        Arrays.sort(nums);
        int min = 1440 - nums[nums.length - 1] + nums[0];
        for (int i = 1; i < nums.length; i++) {
            min = Math.min(min, nums[i] - nums[i - 1]);
        }
        return min;
    }
}
