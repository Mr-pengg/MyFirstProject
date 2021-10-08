package com.learn.code9_1;

import java.util.ArrayList;
import java.util.List;

/**
 * @author pengg
 * @date 2021/10/8 10:12
 */
public class GnericList {
    public static void main(String[] args) {
        List list1 = new ArrayList();
        List list2 = new ArrayList<String>();
        list2.add(1);
        list2.add("123");
        System.out.println(list1.getClass());
        System.out.println(list2.getClass());
        list2.forEach(e->System.out.println(e));
        List<String> list3 = new ArrayList();
//        list3.add(1);

    }
}
