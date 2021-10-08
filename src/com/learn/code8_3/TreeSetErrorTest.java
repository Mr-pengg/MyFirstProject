package com.learn.code8_3;

import java.util.TreeSet;

/**
 * @author pengg
 * @date 2021/9/26 21:03
 */
public class TreeSetErrorTest {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("1312");
//        treeSet.add(""+new Date());
//        treeSet.con
        TreeSet treeSet1 = new TreeSet();
        D d = new D(10);
        treeSet1.add(new D(1));
        treeSet1.add(d);
        treeSet1.add(new D(2));
        treeSet1.add(new D(11));
        treeSet1.add(new D(13));
        System.out.println(treeSet1);
        System.out.println("**********");

        D last = (D) treeSet1.last();
        last.setK(-2);
        System.out.println(treeSet1);
        //删除被修改元素
        System.out.println(treeSet1.remove(new D(-2)));
        System.out.println(treeSet1.remove(new D(11)));
        System.out.println(treeSet1);
        System.out.println("----------------");
        System.out.println(treeSet1.remove(new D(10)));
        System.out.println(treeSet1);



    }
}

class D implements Comparable {
    private int k;

    public int getK() {
        return k;
    }

    public void setK(int k) {
        this.k = k;
    }

    public D() {
    }

    public D(int k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "D{" +
                "k=" + k +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        D d = (D) o;
        return k == d.k;
    }

    @Override
    public int compareTo(Object o) {
        return this.k - ((D) o).k;
    }
}
