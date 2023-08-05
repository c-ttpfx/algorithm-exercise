package com.ttpfx.面试经典150题;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;

/**
 * @author ttpfx
 * @date 2023/5/18
 */
public class 反转字符串中的单词 {

    public String reverseWords(String s) {
        StringBuilder ans = new StringBuilder();
        int end = s.length();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                if (end - i > 1) {
                    ans.append(s, i, end);
                }
                end = i;
            }
        }
        if (end != 0) {
            ans.append(" ");
            ans.append(s, 0, end);
        }
        return ans.substring(1);
    }
}
