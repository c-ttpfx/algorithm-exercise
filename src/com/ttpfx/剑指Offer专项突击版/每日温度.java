package com.ttpfx.剑指Offer专项突击版;

/**
 * @author ttpfx
 * @date 2023/2/3
 */
public class 每日温度 {

    /*
    请根据每日 气温 列表 temperatures ，重新生成一个列表，要求其对应位置的输出为：要想观测到更高的气温，
    至少需要等待的天数。如果气温在这之后都不会升高，请在该位置用 0 来代替。
     */
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        for (int i = temperatures.length - 2; i >= 0; i--) {
            if (temperatures[i] < temperatures[i + 1]) ans[i] = 1;
            else {
                int index = i + 1;
                int day = 1;
                while (index < temperatures.length) {
                    if (ans[index] == 0 || temperatures[index] > temperatures[i]) break;
                    day += ans[index];
                    index += ans[index];
                }
                if (temperatures[index] > temperatures[i]) ans[i] = day;
            }
        }
        return ans;
    }
}
