package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/14
 */
public class H指数 {

    public int hIndex(int[] citations) {
        int[] counter = new int[citations.length + 1];
        for (int citation : citations) {
            counter[Math.min(citation, citations.length)]++;
        }
        int sum = 0;
        for (int i = citations.length; i >= 0; i--) {
            sum += counter[i];
            if (sum >= i) return i;
        }
        return 0;
    }
}
