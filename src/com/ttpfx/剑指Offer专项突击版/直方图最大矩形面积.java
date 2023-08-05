package com.ttpfx.剑指Offer专项突击版;

import java.util.*;

/**
 * @author ttpfx
 * @date 2023/2/3
 */
public class 直方图最大矩形面积 {

    /*
    给定非负整数数组 heights ，数组中的数字用来表示柱状图中各个柱子的高度。每个柱子彼此相邻，且宽度为 1 。

    求在该柱状图中，能够勾勒出来的矩形的最大面积。
     */
    //对于每个位置，寻找左右第一个小于该位置值的下标，两个坐标之间的值高度都会大于当前位置的高度
//    public int largestRectangleArea(int[] heights) {
//        Deque<Integer> monotonicStack = new ArrayDeque<>();
//        int[] left = new int[heights.length];
//        int[] right = new int[heights.length];
//        for (int i = 0; i < heights.length; i++) {
//            while (!monotonicStack.isEmpty() && heights[monotonicStack.peek()] >= heights[i]) monotonicStack.pop();
//            left[i] = monotonicStack.isEmpty() ? -1 : monotonicStack.peek();
//            monotonicStack.push(i);
//        }
//        monotonicStack.clear();
//        for (int i = heights.length - 1; i >= 0; i--) {
//            while (!monotonicStack.isEmpty() && heights[monotonicStack.peek()] >= heights[i]) monotonicStack.pop();
//            right[i] = monotonicStack.isEmpty() ? heights.length : monotonicStack.peek();
//            monotonicStack.push(i);
//        }
//        int max = 0;
//        for (int i = 0; i < heights.length; i++) {
//            max = Math.max(max, (right[i] - left[i] - 1) * heights[i]);
//        }
//        return max;
//    }


    // 对上面进行优化，在初始化单调栈的时候，如果heights[monotonicStack.peek()] >= heights[i]
    // 那么就代表monotonicStack.peek()这个位置右边第一个小于的位置就是i
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> monotonicStack = new ArrayDeque<>();
        int[] left = new int[heights.length];
        int[] right = new int[heights.length];
        Arrays.fill(right, heights.length);
        for (int i = 0; i < heights.length; i++) {
            while (!monotonicStack.isEmpty() && heights[monotonicStack.peek()] >= heights[i])
                right[monotonicStack.pop()] = i;
            left[i] = monotonicStack.isEmpty() ? -1 : monotonicStack.peek();
            monotonicStack.push(i);
        }
        int max = 0;
        for (int i = 0; i < heights.length; i++) {
            max = Math.max(max, (right[i] - left[i] - 1) * heights[i]);
        }
        return max;
    }


}
