package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/1/8
 */
public class 二进制加法 {

    /*
    给定两个 01 字符串 a 和 b ，请计算它们的和，并以二进制字符串的形式输出。
    输入为 非空 字符串且只包含数字 1 和 0。
     */

    public String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int ia = a.length() - 1;
        int ib = b.length() - 1;
        int carry = 0;
        while (ia >= 0 && ib >= 0) {
            if (a.charAt(ia--) == b.charAt(ib--)) {
                sb.append(carry);
                carry = a.charAt(ia + 1) - '0';
            } else {
                if (carry == 1) sb.append(0);
                else sb.append(1);
            }
        }
        if (ia == ib && carry == 1) sb.append(1);
        else {
            handlePreStr(sb, a, ia, carry);
            handlePreStr(sb, b, ib, carry);
        }
        return sb.reverse().toString();
    }

    public void handlePreStr(StringBuilder sb, String s, int index, int carry) {
        while (index >= 0) {
            if (carry == 1) {
                if (s.charAt(index--) == '1') sb.append(0);
                else {
                    sb.append(1);
                    carry = 0;
                }
            } else sb.append(s.charAt(index--));
            if (index < 0 && carry == 1) sb.append(1);
        }
    }

}
