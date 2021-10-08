package com.learn.code8_3;

import java.util.TreeSet;

/**
 * 利用comparator 自定义排序
 *
 * @author pengg
 * @date 2021/9/27 16:24
 */
public class TreeSetTest4 {
    public static void main(String[] args) {
//        Comparator
        //为什么comparator接口可以用lambda表达式？
        //继承Object的所有抽象方法都不算
        TreeSet treeSet = new TreeSet((o1, o2) -> {
            M m1 = (M) o1;
            M m2 = (M) o2;
            return m1.getAge() > m2.getAge() ? 1 : m1.getAge() == m2.getAge() ? 1 : -1;
        });
        treeSet.add(new M(1));
        treeSet.add(new M(12));
        treeSet.add(new M(-1));
        treeSet.add(new M(101));
        treeSet.add(new M(-21));
        System.out.println(treeSet);
    }
}

class M {
    int age;

    public M(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "M{" +
                "age=" + age +
                '}';
    }
}
