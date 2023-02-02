package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

/**
 * @author ttpfx
 * @date 2023/1/17
 */
public class 字符串中的变位词 {

    /*
    给定两个字符串 s1 和 s2，写一个函数来判断 s2 是否包含 s1 的某个变位词。
    换句话说，第一个字符串的排列之一是第二个字符串的 子串 。
     */

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) return false;
        int[] cur = new int[26];
        int[] starter = new int[26];
        for (int i = 0; i < s1.length(); i++) {
            starter[s1.charAt(i) - 'a']++;
        }
        for (int i = 0; i < s1.length(); i++) {
            cur[s2.charAt(i) - 'a']++;
        }
        if (check(starter, cur)) return true;
        for (int i = s1.length(); i < s2.length(); i++) {
            cur[s2.charAt(i - s1.length()) - 'a']--;
            cur[s2.charAt(i) - 'a']++;
            if (check(starter, cur)) return true;
        }
        return false;
    }

    public boolean check(int[] starter, int[] cur) {
        for (int i = 0; i < starter.length; i++) {
            if (starter[i] == 0) continue;
            if (starter[i] != cur[i]) return false;
        }
        return true;
    }

    @Test
    public void test() {
        String s1 = "dboa";
        String s2 = "eidboaoo";
        System.out.println(checkInclusion(s1, s2));
    }
}
