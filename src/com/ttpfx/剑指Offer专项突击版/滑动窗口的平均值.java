package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/2/23
 */
public class 滑动窗口的平均值 {

    class MovingAverage {

        int[] window;
        int p;
        double sum;
        int count;

        /**
         * Initialize your data structure here.
         */
        public MovingAverage(int size) {
            window = new int[size];
        }

        public double next(int val) {
            sum += val - window[p];
            window[p] = val;
            p = (p + 1) % window.length;
            count = Math.min(count+1, window.length);
            return sum / count;
        }
    }
}
