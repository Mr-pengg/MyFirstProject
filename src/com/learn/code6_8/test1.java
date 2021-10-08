package com.learn.code6_8;

/**
 * lambda表达式：针对于接口只有一个抽象方法
 *
 * @author pengg
 * @date 2021/9/17 11:23
 */
public class test1 {
    public static void main(String[] args) {
        B b = str -> System.out.println(str);
        b.show("i am a hero 6666666");
        Runnable run = () -> {
            int age = 100;
            System.out.println(age);
        };
        run.run();
        //        A a = ()->{
//            System.out.println("抽象类的方法");
//        };
        C c = () -> "Master";

        System.out.println(c.getName());
        B b2 = str -> {

        };
        //抽象类可以使用定义的方法，但是lambda表达式不可以使用
        B a = new B() {
            @Override
            public void show(String str) {
                System.out.println(getAge());
            }
        };
//        new c(){};

        Object o = (C)()->{
            return "666";
        };
    }
}

//lambda表达式必须是接口不能是抽象类
abstract class A {
    public abstract void show();

}

interface C {
    String getName();
}

interface B {
    public abstract void show(String str);

    //    int getM();
    default Integer getAge() {
        return 10;
    }
}
