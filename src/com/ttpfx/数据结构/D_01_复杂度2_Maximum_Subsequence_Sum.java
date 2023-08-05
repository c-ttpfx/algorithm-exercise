package com.ttpfx.数据结构;

import java.util.Scanner;

/**
 * @author ttpfx
 * @date 2023/3/18
 */
public class D_01_复杂度2_Maximum_Subsequence_Sum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        int start = 0;
        int end = 0;
        int sum = 0;
        int max = nums[0];
        int cLen = 0;
        for (int i = 0; i < n; i++) {
            if (max < sum) {
                max = sum;
                end = i;
                start = i - cLen;
            }
            cLen++;
            sum += nums[i];
            if (sum < 0) {
                sum = 0;
                cLen = 0;
            }
        }
        System.out.print(max);
        for (int i = start; i < end; i++) {
            System.out.print(" " + nums[i]);
        }
    }
}
