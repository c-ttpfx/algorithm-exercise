package com.ttpfx.面试经典150题;

import java.util.HashMap;

/**
 * @author ttpfx
 * @date 2023/5/16
 */
public class 罗马数字转整数 {

    HashMap<Character, Integer> hashMap = new HashMap<>();

    {
        hashMap.put('I', 1);
        hashMap.put('V', 5);
        hashMap.put('X', 10);
        hashMap.put('L', 50);
        hashMap.put('C', 100);
        hashMap.put('D', 500);
        hashMap.put('M', 1000);
    }

    public int romanToInt(String s) {
        int sum = 0;
        int next = hashMap.get(s.charAt(0));
        for (int i = 0; i < s.length() - 1; i++) {
            int a = next;
            next = hashMap.get(s.charAt(i + 1));
            sum += a >= next ? a : -a;
        }
        sum += next;
        return sum;
    }

    public static void main(String[] args) {
        int num = new 罗马数字转整数().romanToInt("III");
        System.out.println(num);
    }
}

