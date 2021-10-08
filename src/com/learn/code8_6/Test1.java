package com.learn.code8_6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * @author pengg
 * @date 2021/9/29 18:30
 */
public class Test1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("1", "2");
        map.put(null, "3");
        Set set = map.keySet();
        System.out.println(set);
        System.out.println(map.containsKey("1"));
        Set set1 = map.entrySet();
        System.out.println("**********");
        System.out.println(set1);

        Map map1 = new HashMap();
        map1.put("3", "4");
        map.putAll(map1);
        System.out.println(map);
        System.out.println("------------");
        for (Object key : map.keySet()) {
            System.out.println(key + "," + map.get(key));
        }
//        BiFunction
        System.out.println("----------------");
//        System.out.println(map.put("3", "12"));
        System.out.println("**************");
        System.out.println(map.entrySet());
        Map map2 = new HashMap();
        System.out.println("************");
        System.out.println(map2.put(1, "12345"));
        System.out.println(map2.put(1, "300"));
        map2.put(null,"12");
        map2.put(null,"12");
        map2.put(null,"12");
        map2.remove(null);
        System.out.println(map2);

    }
}
