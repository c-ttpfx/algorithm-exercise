package com.ttpfx.面试经典150题;

import java.util.*;

/**
 * @author ttpfx
 * @date 2023/5/14
 */
public class O1时间插入删除和获取随机元素 {

    class RandomizedSet {
        HashMap<Integer, Integer> hashMap; //值->索引
        List<Integer> list;
        Random random;

        public RandomizedSet() {
            list = new ArrayList<>();
            hashMap = new HashMap<>();
            random = new Random();
        }

        public boolean insert(int val) {
            if (hashMap.containsKey(val)) return false;
            list.add(val);
            hashMap.put(val, list.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if (!hashMap.containsKey(val)) return false;
            Integer index = hashMap.remove(val);
            list.set(index, list.get(list.size() - 1));
            list.remove(list.size() - 1);
            if (index < list.size()) hashMap.put(list.get(index), index);
            return true;
        }

        public int getRandom() {
            return list.get(random.nextInt(list.size()));
        }
    }
}
