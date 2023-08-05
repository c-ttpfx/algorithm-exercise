package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

/**
 * @author ttpfx
 * @date 2023/1/21
 */
public class 有效的回文 {

    /*
    给定一个字符串 s ，验证 s 是否是 回文串 ，只考虑字母和数字字符，可以忽略字母的大小写。
    本题中，将空字符串定义为有效的 回文串 。
     */
    public boolean isPalindrome(String s) {
        int l = 0, r = s.length() - 1;
        while (l < r) {
            while (!Character.isLetterOrDigit(s.charAt(l)) && l < r) l++;
            while (!Character.isLetterOrDigit(s.charAt(r)) && l < r) r--;
            if (l >= r) break;
            if (Character.toLowerCase(s.charAt(l++)) != Character.toLowerCase(s.charAt(r--))) return false;
        }
        return true;
    }

    @Test
    public void test() {
        String s = "race a car";
        boolean palindrome = isPalindrome(s);
        System.out.println(palindrome);
    }
}
