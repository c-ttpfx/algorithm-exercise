package com.ttpfx.面试经典150题;


/**
 * @author ttpfx
 * @date 2023/5/14
 */
public class 加油站 {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int start = 0;
        int sum = 0;
        int k = 0;
        for (int i = 0; i < gas.length; i++) {
            int dif = gas[i] - cost[i];
            sum += dif;
            k += dif;
            if (k < 0) {
                k = 0;
                start = i + 1;
            }
        }
        return sum >= 0 ? start : -1;
    }
}
