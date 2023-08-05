package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/17
 */
public class 最长公共前缀 {

    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        int k = 0;
        while (k < strs[0].length()) {
            char target = strs[0].charAt(k);
            for (int i = 1; i < strs.length; i++) {
                if (k >= strs[i].length() || target != strs[i].charAt(k)) {
                    return sb.toString();
                }
            }
            sb.append(target);
            k++;
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String s = new 最长公共前缀().longestCommonPrefix(null);
        System.out.println(s.length());
    }
}
