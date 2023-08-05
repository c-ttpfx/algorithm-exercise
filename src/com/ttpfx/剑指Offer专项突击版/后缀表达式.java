package com.ttpfx.剑指Offer专项突击版;

import java.util.Stack;

/**
 * @author ttpfx
 * @date 2023/2/2
 */
public class 后缀表达式 {

    /*
    根据 逆波兰表示法，求该后缀表达式的计算结果。

    有效的算符包括 +、-、*、/ 。每个运算对象可以是整数，也可以是另一个逆波兰表达式。
     */
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();
        for (String token : tokens) {
            switch (token) {
                case "+":
                    stack.push(stack.pop() + stack.pop());
                    break;
                case "-":
                    stack.push(-stack.pop() + stack.pop());
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int a = stack.pop();
                    stack.push(stack.pop() / a);
                    break;
                default:
                    stack.push(Integer.parseInt(token));
            }
        }
        return stack.pop();
    }
}
