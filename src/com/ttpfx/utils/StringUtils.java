package com.ttpfx.utils;

/**
 * @author ttpfx
 * @date 2023/1/16
 */
public class StringUtils {

    public static String changeCharter(String word){
        return word.replaceAll("\\[", "{").replaceAll("]", "}");
    }
}
