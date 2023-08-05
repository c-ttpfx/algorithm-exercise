package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/2/23
 */
public class 矩阵中最大的矩形 {

    /*
    给定一个由 0 和 1 组成的矩阵 matrix ，找出只包含 1 的最大矩形，并返回其面积。
    注意：此题 matrix 输入格式为一维 01 字符串数组。
     */
    public int maximalRectangle(String[] matrix) {
        int[][] preSum = new int[matrix.length][matrix[0].length()];
        preSum[0][0] = matrix[0].charAt(0)-'0';
        for (int i = 1; i < matrix[0].length(); i++) {
            preSum[0][i] = preSum[0][i - 1] + matrix[0].charAt(i)-'0';
        }
        for (int i = 1; i < matrix.length; i++) {
            preSum[i][0] = preSum[i - 1][0] + matrix[0].charAt(i)-'0';
        }
        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[i].length(); j++) {
                preSum[i][j] = preSum[i - 1][j] + preSum[i][j - 1] - preSum[i - 1][j - 1];
            }
        }

        return 0;
    }
}
