package com.ttpfx.剑指Offer专项突击版;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author ttpfx
 * @date 2023/1/17
 */
public class 字符串中的所有变位词 {


    /*
    给定两个字符串 s 和 p，找到 s 中所有 p 的 变位词 的子串，返回这些子串的起始索引。不考虑答案输出的顺序。
    变位词 指字母相同，但排列不同的字符串。
     */
    public List<Integer> findAnagrams(String s, String p) {
        if (s.length() < p.length()) return new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        int[] starter = new int[26];
        int[] cur = new int[26];
        for (int i = 0; i < p.length(); i++) {
            starter[p.charAt(i) - 'a']++;
            cur[s.charAt(i) - 'a']++;
        }
        if (Arrays.equals(starter, cur)) ans.add(0);
        for (int i = 1; i <= s.length() - p.length(); i++) {
            cur[s.charAt(i - 1) - 'a']--;
            cur[s.charAt(i + p.length() - 1) - 'a']++;
            if (Arrays.equals(starter, cur)) ans.add(i);
        }
        return ans;
    }
}
