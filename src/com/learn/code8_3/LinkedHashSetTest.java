package com.learn.code8_3;

import java.util.LinkedHashSet;

/**
 * @author pengg
 * @date 2021/9/26 20:24
 */
public class LinkedHashSetTest {
    public static void main(String[] args) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("1");
        linkedHashSet.add("2");
        linkedHashSet.add("3");
        System.out.println(linkedHashSet);
        linkedHashSet.remove("2");
        System.out.println(linkedHashSet);

    }
}
