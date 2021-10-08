package com.learn;

public class test1 {
    public static void main(String[] args) {
        Abc abc = new Abc();
        abc.show();
    }
}
class Abc{
    private int a;
    class B{
        private String str = "name";
        public void show(){
//            内部类访问外部类的私有变量
            System.out.println(str);
        }

    }
    class C extends B{
        public void  show(){
            System.out.println(new B().str);
        }
    }

    {
        System.out.println("........");
    }
//    static {
//        new B();
//    }
    static class S{
        private String str = "13";
        private Integer integer = 123;
        public void test(){
//            System.out.println(a);

        }
    }
    public void show(){
        System.out.println(new B().str);


    }
}
interface inT{
//    接口里面可以使用内部类，默认为public static修饰
    class innerClass{

    }
    interface inIn{

    }
}
