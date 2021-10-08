package com.learn.code8_3;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author pengg
 * @date 2021/9/26 18:39
 */
public class HashSetTest {
    public static void main(String[] args) {
        Set set = new HashSet();
        System.out.println(set.add("1"));
        System.out.println("************");
        System.out.println(set.add("1"));
        System.out.println(set.toString());
        set.add(null);
        System.out.println(set.toString());

        System.out.println("------------------");
        Set hashSet = new HashSet();
        System.out.println(hashSet.add(new A(1)));
        System.out.println(hashSet.add(new A(10)));
        System.out.println(hashSet.add(new A(3)));
        System.out.println(hashSet.add(new A(4)));
//        System.out.println(hashSet.add(new B()));
//        System.out.println(hashSet.add(new B()));
        System.out.println("**********");
        System.out.println(hashSet.size());
        System.out.println(hashSet);
        Iterator iterator = hashSet.iterator();
        System.out.println("****************");
        A next = (A) iterator.next();
        System.out.println(next.getK());
        next.setK(3);
        System.out.println(hashSet);
//        iterator.remove();
        hashSet.remove(new A(3));
        System.out.println(hashSet);
        System.out.println(hashSet.contains(new A(3)));
        System.out.println(hashSet.contains(new A(1)));
    }
}

class A {
    private Integer k;

    public A() {
    }

    public A(Integer k) {
        this.k = k;
    }

    @Override
    public String toString() {
        return "A{" +
                "k=" + k +
                '}';
    }

    public Integer getK() {
        return k;
    }

    public void setK(Integer k) {
        this.k = k;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this)
            return true;
        if (obj != null && obj.getClass() == A.class) {
            Boolean b = ((A) obj).k == this.k;
            return b;
        }
        return false;
    }

    @Override
    public int hashCode() {
        return k;
    }
}

class B {
    @Override
    public boolean equals(Object obj) {

        return true;
    }
}