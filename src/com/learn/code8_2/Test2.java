package com.learn.code8_2;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author pengg
 * @date 2021/9/24 16:09
 */
public class Test2 {
    public static void main(String[] args) {
        Collection c = new ArrayList();
        c.add("孙悟空");
        c.add("1");
        c.add("1");
        c.add("1");
        c.add("2");
        c.add(1);
        System.out.println(c.toString());
        c.remove("1");
        System.out.println(c.toString());
        System.out.println(c.contains("2"));
//        c.clear();
        System.out.println(c.toString());
        Collection c2 = new ArrayList();
        c2.addAll(c);
        c.clear();
        System.out.println("*********");
        System.out.println(c2.toString());
        Iterator iterator = c2.iterator();
        while (iterator.hasNext()){
            System.out.println(" "+iterator.next());
        }
        System.out.println("----------");
        System.out.println(c2.size());
        Object[] objects = c2.toArray();

    }


}
