package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/1/23
 */
public class 最多删除一个字符得到回文 {

    /*
    给定一个非空字符串 s，请判断如果 最多 从字符串中删除一个字符能否得到一个回文字符串。
     */
    public boolean validPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) {
                return isPalindrome(s.substring(i, s.length() - i - 1)) || isPalindrome(s.substring(i + 1, s.length() - i));
            }
        }
        return true;
    }

    public boolean isPalindrome(String s) {
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;
        }
        return true;
    }
}
