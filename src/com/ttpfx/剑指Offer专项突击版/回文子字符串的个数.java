package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/1/25
 */
public class 回文子字符串的个数 {

    /*
    给定一个字符串 s ，请计算这个字符串中有多少个回文子字符串。
    具有不同开始位置或结束位置的子串，即使是由相同的字符组成，也会被视作不同的子串。
     */
    public int countSubstrings(String s) {
        boolean[][] dp = new boolean[s.length()][s.length()];
        int count = 0;
        for (int i = dp.length - 1; i >= 0; i--) {
            for (int j = i; j < dp[i].length; j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    if (j - i <= 1 || dp[i + 1][j - 1]) {
                        dp[i][j] = true;
                        count++;
                    }
                }

            }
        }
        return count;
    }
}
