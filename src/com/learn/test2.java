package com.learn;

/**
 * 外部类以外创建内部类的对象
 */
public class test2 {
    public static void main(String[] args) {
//
        Abc abc = new Abc();
        //新建非静态类的对象
        Abc.B b = abc.new B();
        Abc.B b1 = new Abc().new B();
    }
}
