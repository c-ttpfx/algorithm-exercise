package com.ttpfx.剑指Offer专项突击版;


import java.util.Arrays;

/**
 * @author ttpfx
 * @date 2023/1/17
 */
public class 不含重复字符的最长子字符串 {

    /*
    给定一个字符串 s ，请你找出其中不含有重复字符的 最长连续子字符串 的长度。
     */
    public int lengthOfLongestSubstring(String s) {
        int[] window = new int[128];
        Arrays.fill(window, -1);
        int max = 0;
        int start = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (window[c] != -1) start = Math.max(start, window[c] + 1);
            max = Math.max(max, i - start + 1);
            window[c] = i;

        }
        return max;
    }

    public void test() {
        String s = "tmmzuxt";
        System.out.println(lengthOfLongestSubstring(s));
    }
}
