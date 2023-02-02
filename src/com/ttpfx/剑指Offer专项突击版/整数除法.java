package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

/**
 * @author ttpfx
 * @date 2023/1/8
 */
public class 整数除法 {
    /*
     * 给定两个整数 a 和 b ，求它们的除法的商 a/b ，要求不得使用乘号 '*'、除号 '/' 以及求余符号 '%' 。
     * */

    public int divide(int a, int b) {
        int factor = a > 0 && b > 0 || a < 0 && b < 0 ? 1 : -1;
        if (b == Integer.MIN_VALUE) return a == Integer.MIN_VALUE ? 1 : 0;
        int addFac = 0;
        if (a == Integer.MIN_VALUE) {
            if (b == 1) return a;
            else if (b == -1) return Integer.MAX_VALUE;
            addFac = 1;
            a++;
        }
        a = Math.abs(a);
        b = Math.abs(b);
        int consult = 0;
        while (a >= b) {
            a -= b;
            if (addFac != 0) {
                a += addFac;
                addFac = 0;
            }
            consult++;
        }
        return consult * factor;
    }

    @Test
    public void test() {
        int divide = divide(2147483647, 3);
        System.out.println(divide);
    }
}
