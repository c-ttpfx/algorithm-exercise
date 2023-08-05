package com.ttpfx.剑指Offer专项突击版;

import java.util.*;

/**
 * @author ttpfx
 * @date 2023/1/31
 */
public class 插入删除和随机访问都是O1的容器 {

    class RandomizedSet {
        Map<Integer, Integer> map;
        List<Integer> list;
        Random random;

        /**
         * Initialize your data structure here.
         */
        public RandomizedSet() {
            map = new HashMap<>();
            list = new ArrayList<>();
            random = new Random();
        }

        /**
         * Inserts a value to the set. Returns true if the set did not already contain the specified element.
         */
        public boolean insert(int val) {
            if (map.containsKey(val)) return false;
            map.put(val, list.size());
            list.add(val);
            return true;
        }

        /**
         * Removes a value from the set. Returns true if the set contained the specified element.
         */
        public boolean remove(int val) {
            if (!map.containsKey(val)) return false;
            int index = map.get(val);
            list.set(index, list.get(list.size() - 1));
            map.put(list.get(index), index);
            list.remove(list.size() - 1);
            map.remove(val);
            return true;
        }

        /**
         * Get a random element from the set.
         */
        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}
