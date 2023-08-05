package com.ttpfx.动态规划;

import java.util.Arrays;
import java.util.Scanner;

/**
 * @author ttpfx
 * @date 2023/4/7
 */
public class dp_01背包 {

    /*
    有 N 件物品和一个容量是 V 的背包。每件物品只能使用一次。
    第 i件物品的体积是 vi价值是 wi
    求解将哪些物品装入背包，可使这些物品的总体积不超过背包容量，且总价值最大。输出最大价值。
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int V = in.nextInt();
        int[] vi = new int[N + 1];
        int[] wi = new int[N + 1];
        int[] si = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            vi[i] = in.nextInt();
            wi[i] = in.nextInt();
            si[i] = in.nextInt();
        }
        int[][] dp = new int[N + 1][V + 1];
        for (int i = 1; i < dp.length; i++) {
            int[] count = new int[dp[i].length];
            for (int j = 1; j < dp[i].length; j++) {
                dp[i][j] = dp[i - 1][j];
                if (dp[i][j] <= dp[i][j-1]){
                    dp[i][j] = dp[i][j-1];
                    count[j] = count[j-1];
                }
                if (vi[i] <= j) {
                    if (dp[i][j - vi[i]] > dp[i - 1][j - vi[i]]) {
                        int k = dp[i][j - vi[i]]+wi[i];
                        if (count[j - vi[i]] < si[i] && k > dp[i][j]) {
                            dp[i][j] = k;
                            count[j] = count[j - vi[i]] + 1;
                        }
                    }else {
                        int k = dp[i-1][j - vi[i]]+wi[i];
                        if (si[i] > 0 && k > dp[i][j]) {
                            dp[i][j] = k;
                            count[j] =  1;
                        }
                    }
                }

            }
        }
        System.out.println(Arrays.toString(dp[1]));
        System.out.println(Arrays.toString(dp[2]));
        System.out.println(Arrays.toString(dp[3]));
        System.out.println(Arrays.stream(dp[N]).max().getAsInt());
    }
}
