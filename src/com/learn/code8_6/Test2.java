package com.learn.code8_6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author pengg
 * @date 2021/9/30 10:59
 */
public class Test2 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put("123", "123");
        map.put("1234", "1234");
        map.put("12", "12345");
        Iterator iterator = map.keySet().iterator();
        System.out.println("************");
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(map.get(next));
            //            System.out.println(iterator.next());
//            System.out.println(map.get(iterator.next()));
        }
        map.forEach((a,b)->System.out.println(a+" -> "+b));

    }
}

