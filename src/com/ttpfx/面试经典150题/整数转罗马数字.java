package com.ttpfx.面试经典150题;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * @author ttpfx
 * @date 2023/5/17
 */
public class 整数转罗马数字 {
    HashMap<Integer, String> hashMap;

    {
        hashMap = new HashMap<>();
        hashMap.put(1, "I");
        hashMap.put(2, "II");
        hashMap.put(3, "III");
        hashMap.put(4, "IV");
        hashMap.put(5, "V");
        hashMap.put(9, "IX");
        hashMap.put(10, "X");
        hashMap.put(20, "XX");
        hashMap.put(30, "XXX");
        hashMap.put(40, "XL");
        hashMap.put(50, "L");
        hashMap.put(90, "XC");
        hashMap.put(100, "C");
        hashMap.put(200, "CC");
        hashMap.put(300, "CCC");
        hashMap.put(400, "CD");
        hashMap.put(500, "D");
        hashMap.put(900, "CM");
        hashMap.put(1000, "M");
        hashMap.put(2000, "MM");
        hashMap.put(3000, "MMM");
    }

    public String intToRoman(int num) {
        String ans = "";
        int fac = 1;
        while (num != 0) {
            int cur = num % 10 * fac;
            if (hashMap.containsKey(cur)) {
                ans = hashMap.get(cur) + ans;
            } else if (cur != 0) {
                ans = hashMap.get(cur - fac * 5) + ans;
                ans = hashMap.get(fac * 5) + ans;
            }
            fac *= 10;
            num /= 10;
        }
        return ans;
    }
}
