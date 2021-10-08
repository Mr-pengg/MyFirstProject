package com.learn.code6_8;

import com.sun.istack.internal.Nullable;

/**
 * 方法引用与构造器引用
 * @author pengg
 * @date 2021/9/17 15:42
 */
public class test2 {
    public static void main(String[] args) {
        AA a = (str) -> System.out.println(str);
        AA a2 = (@Nullable String str) -> System.out.println(str);
//      AA a2 = (@Nullable  str)->System.out.println(str);
        //引用类方法
        BB b = (String str)->Integer.parseInt(str);
        BB b1 = Integer::parseInt;
        System.out.println(b1.show("123123"));
        //引用特定对象的实例方法
        DD dd = (c)->c.getAge();
        DD dd1 = CC::getAge;
        System.out.println(dd1.show(new CC()));
        //引用某类对象的实例方法
        EE ee = (c,str)->c.getS(str);
        EE ee1 = CC::getS;
        System.out.println(ee1.getInfo(new CC(),"pg"));
        //引用构造器
        FF ff = ()->new CC();
        FF ff1 = CC::new;
        System.out.println(ff1.getCC().getS("dafadsf"));
    }
}

interface AA {
    void show(@Nullable String str);
}
interface BB{
    Integer show(String str);
}
interface DD{
    Integer show(CC cc);
}
interface EE{
    String getInfo(CC c,String str);
}
interface FF{
    CC getCC();
}
class CC{
    public Integer getAge(){
        return 100;
    }
    public String getS(String str){
        return str;
    }
}