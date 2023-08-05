package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ttpfx
 * @date 2023/3/14
 */
public class 含有所有字符的最短字符串 {

    public String minWindow(String s, String t) {
        int start = 0;
        int min = Integer.MAX_VALUE;
        int left = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (map.containsKey(c)) {
                int num = map.get(c);
                map.put(c, num - 1);
                if (num == 1) count++;
                if (count == map.size()) {
                    for (int j = start; j <= i; j++) {
                        char c1 = s.charAt(j);
                        if (map.containsKey(c1)) {
                            int v = map.get(c1);
                            if (v == 0) {
                                start = j;
                                if (min >= i - start + 1) {
                                    min = i - start + 1;
                                    left = j;
                                }
                                break;
                            }
                            map.put(c1, v + 1);
                        }

                    }
                }
            }
        }
        if (min == Integer.MAX_VALUE) return "";
        return s.substring(left, left + min);
    }

    @Test
    public void t1() {
        String s = "cabwefgewcwaefgcf";
        String t = "cae";
        String s1 = minWindow(s, t);
        System.out.println(s1);
    }
}
