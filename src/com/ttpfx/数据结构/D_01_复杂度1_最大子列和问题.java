package com.ttpfx.数据结构;

import java.util.Scanner;

/**
 * @author ttpfx
 * @date 2023/3/18
 */
public class D_01_复杂度1_最大子列和问题 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += in.nextInt();
            max = Math.max(max, sum);
            sum = Math.max(sum, 0);
        }
        System.out.println(max);
    }
}
