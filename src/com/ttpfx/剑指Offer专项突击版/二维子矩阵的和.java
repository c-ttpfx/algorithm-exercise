package com.ttpfx.剑指Offer专项突击版;

import com.ttpfx.utils.StringUtils;
import org.testng.annotations.Test;

/**
 * @author ttpfx
 * @date 2023/1/16
 */
public class 二维子矩阵的和 {

    /*
    给定一个二维矩阵 matrix，以下类型的多个请求：

    计算其子矩形范围内元素的总和，该子矩阵的左上角为 (row1,col1) ，右下角为 (row2,col2) 。
    实现 NumMatrix 类：

    NumMatrix(int[][] matrix)给定整数矩阵 matrix 进行初始化
    int sumRegion(int row1, int col1, int row2, int col2)返回左上角 (row1,col1)、右下角(row2,col2)的子矩阵的元素总和。

     */
    class NumMatrix {
        private int[][] preSum;

        public NumMatrix(int[][] matrix) {
            preSum = new int[matrix.length][matrix[0].length];
            preSum[0][0] = matrix[0][0];
            for (int j = 1; j < matrix[0].length; j++) {
                preSum[0][j] = preSum[0][j - 1] + matrix[0][j];
            }
            for (int i = 1; i < matrix.length; i++) {
                preSum[i][0] = preSum[i - 1][0] + matrix[i][0];
            }
            for (int i = 1; i < matrix.length; i++) {
                for (int j = 1; j < matrix[i].length; j++) {
                    preSum[i][j] = preSum[i][j - 1] + preSum[i - 1][j] - preSum[i - 1][j - 1]+matrix[i][j];
                }
            }
        }

        public int sumRegion(int row1, int col1, int row2, int col2) {
            if (row1 == 0 && col1 == 0) return preSum[row2][col2];
            else if (row1 == 0) return preSum[row2][col2] - preSum[row2][col1 - 1];
            else if (col1 == 0) return preSum[row2][col2] - preSum[row1 - 1][col2];
            return preSum[row2][col2] - preSum[row2][col1 - 1] - preSum[row1 - 1][col2] + preSum[row1 - 1][col1 - 1];
        }
    }

    @Test
    public void test(){
        int[][] matrix = {{3,0,1,4,2},{5,6,3,2,1},{1,2,0,1,5},{4,1,0,1,7},{1,0,3,0,5},{2,1,4,3},{1,1,2,2},{1,2,2,4}};
        NumMatrix numMatrix = new NumMatrix(matrix);
        System.out.println(1);
    }
}

