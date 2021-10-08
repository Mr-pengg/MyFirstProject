package com.learn.code8_3;

import java.util.TreeSet;

/**
 * @author pengg
 * @date 2021/9/26 20:27
 */
public class TreeSetTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("1");
        treeSet.add("31");
        treeSet.add("3");
        treeSet.add("4");
        System.out.println(treeSet);
        System.out.println(treeSet.first());
        System.out.println(treeSet.last());
        System.out.println(treeSet.subSet("2","3"));
        System.out.println(treeSet.headSet("3"));
        System.out.println(treeSet.tailSet("2"));
        treeSet.add(new Enty());

    }
}

class Enty implements Comparable{
    private Integer k;
    @Override
    public int compareTo(Object o) {

        return (this.k>((Enty)o).k)?1:1;
    }
}
