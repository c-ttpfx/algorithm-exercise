package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

/**
 * @author ttpfx
 * @date 2023/1/9
 */
public class 单词长度的最大乘积 {

    /*
    给定一个字符串数组words，请计算当两个字符串 words[i] 和 words[j] 不包含相同字符时，
    它们长度的乘积的最大值。假设字符串中只包含英语的小写字母。如果没有不包含相同字符的一对字符串，返回 0。
     */
    public int maxProduct(String[] words) {
        int[] nums = new int[words.length];
        for (int i = 0; i < words.length; i++) {
            int num = 0;
            for (char c : words[i].toCharArray()) {
                num |= (1 << (c - 'a'));
            }
            nums[i] = num;
        }
        int max = 0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if ((nums[i] & nums[j]) == 0) {
                    max = Math.max(max, words[i].length() * words[j].length());
                }
            }
        }
        return max;
    }

    @Test
    public void test() {
        String[] words = {"abcw", "baz", "foo", "bar", "xtfn", "abcdef"};
        int i = maxProduct(words);
        System.out.println(i);
    }
}
