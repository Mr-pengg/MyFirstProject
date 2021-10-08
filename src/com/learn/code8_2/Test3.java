package com.learn.code8_2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author pengg
 * @date 2021/9/24 17:02
 */
public class Test3 {
    public static void main(String[] args) {
        Set hashSet = new HashSet();
        hashSet.add("1");
        hashSet.add("2");
        hashSet.add("13");
        hashSet.add("123");
        hashSet.add("14");
        Iterator iterator = hashSet.iterator();
        System.out.println("********");
//        iterator.forEachRemaining(o -> System.out.println(o));
        while (iterator.hasNext()) {
            System.out.println(":" + iterator.next());
//            iterator.remove();
//            hashSet.remove("1");
        }
        System.out.println("-------------");
        hashSet.forEach(obj -> System.out.println(obj));
        hashSet.remove("1");
        System.out.println("**************");
        hashSet.forEach(o -> System.out.println(o));

    }
}
