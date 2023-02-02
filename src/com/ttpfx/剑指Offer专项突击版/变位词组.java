package com.ttpfx.剑指Offer专项突击版;

import org.testng.annotations.Test;

import java.util.*;

/**
 * @author ttpfx
 * @date 2023/2/1
 */
public class 变位词组 {


    /*
    给定一个字符串数组 strs ，将 变位词 组合在一起。 可以按任意顺序返回结果列表。

    注意：若两个字符串中每个字符出现的次数都相同，则称它们互为变位词。
     */

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            int[] counts = new int[26];
            int length = str.length();
            for (int i = 0; i < length; i++) {
                counts[str.charAt(i) - 'a']++;
            }
            // 将每个出现次数大于 0 的字母和出现次数按顺序拼接成字符串，作为哈希表的键
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < 26; i++) {
                if (counts[i] != 0) {
                    sb.append((char) ('a' + i));
                    sb.append(counts[i]);
                }
            }
            String key = sb.toString();
            List<String> list = map.getOrDefault(key, new ArrayList<String>());
            list.add(str);
            map.put(key, list);
        }
        return new ArrayList<List<String>>(map.values());
    }


    @Test
    public void test() {
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};
        List<List<String>> lists = groupAnagrams(strs);
        for (List<String> list : lists) {
            System.out.println(list);
        }
    }
}
