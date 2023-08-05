package com.ttpfx.面试经典150题;

/**
 * @author ttpfx
 * @date 2023/5/17
 */
public class 最后一个单词的长度 {

    public int lengthOfLastWord(String s) {
        int index = s.length() - 1;
        while (index >= 0 && s.charAt(index) == ' ') index--;
        int count = 0;
        while (index >= 0 && s.charAt(index--) != ' ') count++;
        return count;
    }
}
