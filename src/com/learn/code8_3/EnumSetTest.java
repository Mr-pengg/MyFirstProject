package com.learn.code8_3;

import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;

/**
 * @author pengg
 * @date 2021/9/27 19:27
 */

public class EnumSetTest {
    public static void main(String[] args) {
        //EnumSet无构造器
        //        new EnumSet();
        EnumSet festivals = EnumSet.allOf(Festival.class);
        Collection c = new HashSet();
        c.add(Festival.MidAutumn);
        c.add(Festival.Spring);
        c.add(Festival.National);
//        festivals.addAll(c);
        System.out.println("*************");
        System.out.println(festivals);
        //        festivals.addAll(Festival.Spring,Festival.MidAutumn);
//        festivals.addAll(Collections.singleton(Festival.MidAutumn));
        festivals.of(Festival.Spring,Festival.MidAutumn);
        System.out.println(festivals);
        festivals.copyOf(c);
        EnumSet festivals1 = festivals.noneOf(Festival.class);
        System.out.println("----------------");
        System.out.println(festivals1);
        festivals1.add(Festival.Spring);

        System.out.println("**********");
        System.out.println(EnumSet.complementOf(festivals1));
//        festivals1.add("242");
    }
}

enum Festival {
    Spring, National, MidAutumn
}
