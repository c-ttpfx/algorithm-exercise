package com.ttpfx.面试经典150题;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @author ttpfx
 * @date 2023/5/20
 */
public class 三数之和 {

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;
            int k = nums.length - 1;
            for (int j = i + 1; j < nums.length - 1; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;
                while (j < k && nums[j] + nums[k] > -nums[i]) k--;
                if (j == k) break;
                if (nums[i] + nums[j] + nums[k] == 0) ans.add(Arrays.asList(nums[i], nums[j], nums[k]));
            }
        }
        return ans;
    }
}
