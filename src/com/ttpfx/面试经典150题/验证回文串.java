package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/20
 */
public class 验证回文串 {

    public boolean isPalindrome(String s) {
        int l = 0;
        int r = s.length() - 1;
        while (l < r) {
            while (!Character.isLetterOrDigit(s.charAt(l)) && l < r) l++;
            while (!Character.isLetterOrDigit(s.charAt(r)) && l < r) r--;
            if (Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) return false;
        }
        return true;
    }
}
