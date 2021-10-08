package com.learn.code8_4;


import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author pengg
 * @date 2021/9/24 19:31
 */
public class Test1 {
    public static void main(String[] args) {
        List list = new ArrayList();
        list.add(1);
        list.add(2);
        list.add(-2);
        list.add(22);
        list.add(3);
        list.add(1, 22);
        System.out.println(list);
//        Comparator
        list.sort((m1, m2) -> {
            int a1 = (Integer) m1;
            int a2 = (Integer) m2;
            return a1 > a2 ? 1 : a1 == a2 ? 0 : -1;
        });
        System.out.println(list);
        new String();
        List list1 = list.subList(2, 4);
        System.out.println(list1);
        System.out.println(list);
        System.out.println(list.indexOf(2));
        list.set(0, 999);
        System.out.println(list);
        ListIterator listIterator = list.listIterator();
        System.out.println("***********");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.hasPrevious());
            System.out.println(listIterator.next());

            System.out.println("----------------");
        }
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }

}
