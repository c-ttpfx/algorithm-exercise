package com.ttpfx.剑指Offer专项突击版;

import java.util.*;

/**
 * @author ttpfx
 * @date 2023/2/2
 */
public class 小行星碰撞 {

    /*
    给定一个整数数组 asteroids，表示在同一行的小行星。

    对于数组中的每一个元素，其绝对值表示小行星的大小，正负表示小行星的移动方向（正表示向右移动，负表示向左移动）。
    每一颗小行星以相同的速度移动。

    找出碰撞后剩下的所有小行星。碰撞规则：两个行星相互碰撞，较小的行星会爆炸。
    如果两颗行星大小相同，则两颗行星都会爆炸。两颗移动方向相同的行星，永远不会发生碰撞。

     */
    public int[] asteroidCollision(int[] asteroids) {
        Deque<Integer> stack = new ArrayDeque<>();
        for (int asteroid : asteroids) {
            if (stack.isEmpty() || asteroid > 0 || stack.peek() <0) stack.push(asteroid);
            else {
                boolean flag = false;
                while (!stack.isEmpty()) {
                    if (stack.peek() < 0) {
                        stack.push(asteroid);
                        break;
                    }else if (stack.peek() == -asteroid) {
                        flag = true;
                        stack.pop();
                        break;
                    }else if (stack.peek() > -asteroid) break;
                    else stack.pop();
                }
                if (stack.isEmpty() && !flag) stack.push(asteroid);
            }
        }
        int[] ans = new int[stack.size()];
        for (int i = ans.length - 1; i >= 0; i--) {
            ans[i] = stack.pop();
        }
        return ans;
    }
}
