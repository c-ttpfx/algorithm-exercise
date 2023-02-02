package com.ttpfx.剑指Offer专项突击版;

import java.util.HashMap;

/**
 * @author ttpfx
 * @date 2023/2/1
 */
public class 有效的变位词 {

    /*
    给定两个字符串 s 和 t ，编写一个函数来判断它们是不是一组变位词（字母异位词）。

    注意：若 s 和 t 中每个字符出现的次数都相同且字符顺序不完全相同，则称 s 和 t 互为变位词（字母异位词）。
     */
//    public boolean isAnagram(String s, String t) {
//        if (s.length() != t.length() || s.equals(t)) return false;
//        HashMap<Character, Integer> hashMap = new HashMap<>();
//        for (char c : s.toCharArray()) hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
//        for (char c : t.toCharArray()) {
//            int count = hashMap.getOrDefault(c, 0) - 1;
//            if (count < 0) return false;
//            hashMap.put(c, count);
//        }
//        return true;
//    }

    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length() || s.equals(t)) return false;
        int[] diff = new int[26];
        for (char c : s.toCharArray()) diff[c - 'a']++;
        for (char c : t.toCharArray()) if (--diff[c - 'a'] < 0) return false;
        return true;
    }
}
