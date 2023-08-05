package com.ttpfx.面试经典150题;

import java.util.Arrays;

/**
 * @author ttpfx
 * @date 2023/5/20
 */
public class 判断子序列 {

    // public boolean isSubsequence(String s, String t) {
    //     int p = 0;
    //     for (int i = 0; i < t.length(); i++) {
    //         if (p == s.length()) break;
    //         if (t.charAt(i) == s.charAt(p)) p++;
    //     }
    //     return p == s.length();
    // }

    public boolean isSubsequence(String s, String t) {
        int[][] dp = new int[t.length() + 1][26];
        Arrays.fill(dp[t.length()], s.length());
        for (int i = t.length() - 1; i >= 0; i--) {
            for (int j = 0; j < 26; j++) {
                if (t.charAt(i) == j + 'a') dp[i][j] = i;
                else dp[i][j] = dp[i + 1][j];
            }
        }
        int p = 0;
        for (int i = 0; i < s.length(); i++) {
            if (dp[p][s.charAt(i) - 'a'] == t.length()) return false;
            p = dp[p][s.charAt(i) - 'a'] + 1;
        }
        return true;
    }
}
