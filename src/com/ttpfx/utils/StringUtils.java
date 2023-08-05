package com.ttpfx.utils;

import java.util.Scanner;

/**
 * @author ttpfx
 * @date 2023/1/16
 */
public class StringUtils {

    public static String changeCharter(String word){
        return word.replaceAll("\\[", "{").replaceAll("]", "}");
    }

    public static void main(String[] args) {
        String s = new Scanner(System.in).nextLine();
        System.out.println(changeCharter(s));
    }
}
