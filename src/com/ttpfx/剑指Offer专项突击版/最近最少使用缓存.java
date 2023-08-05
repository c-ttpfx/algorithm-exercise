package com.ttpfx.剑指Offer专项突击版;

import java.util.*;

/**
 * @author ttpfx
 * @date 2023/1/31
 */
public class 最近最少使用缓存 {

    /*
    运用所掌握的数据结构，设计和实现一个  LRU (Least Recently Used，最近最少使用) 缓存机制 。
    实现 LRUCache 类：

    以正整数作为容量 capacity 初始化 LRU 缓存
    LRUCache(int capacity)

    如果关键字 key 存在于缓存中，则返回关键字的值，否则返回 -1 。
    int get(int key)

    如果关键字已经存在，则变更其数据值；如果关键字不存在，则插入该组「关键字-值」。
    当缓存容量达到上限时，它应该在写入新数据之前删除最久未使用的数据值，从而为新的数据值留出空间。
    void put(int key, int value) 
     */
    class LRUCache {
        Deque<Integer> deque;
        Map<Integer, Integer> map;
        int capacity;

        public LRUCache(int capacity) {
            deque = new LinkedList<>();
            map = new HashMap<>();
            this.capacity = capacity;
        }

        public int get(int key) {
            if (map.containsKey(key)) {
                deque.remove(key);
                deque.addLast(key);
            }
            return map.getOrDefault(key, -1);
        }

        public void put(int key, int value) {
            if (map.containsKey(key))deque.remove(key);
            else if (deque.size() == capacity) map.remove(deque.removeFirst());
            deque.addLast(key);
            map.put(key, value);
        }
    }
}
