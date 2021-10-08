package com.learn.code6_9;

/**
 * 枚举类
 *
 * @author pengg
 * @date 2021/9/18 15:52
 */
public class EnumT {
    public static void main(String[] args) {
        System.out.println(AbstraEnum.values());
        SchoolEnum schoolEnum = SchoolEnum.Big;
        schoolEnum.show(AbstraEnum.JuniorS);
        AbstraEnum pr = Enum.valueOf(AbstraEnum.class, "pr");

    }
}

enum SchoolEnum {
    //    枚举实例在第一行
    Small, Big;
    private String str;

    public void show(AbstraEnum abstraEnum) {
        switch (abstraEnum) {
            case JuniorS:
                System.out.println("Juniors");
                break;
            case PrimaryS:
                System.out.println("Primarys");
                break;
            default:
                System.out.println("no one adpte you");
        }
        switch (this) {
            case Big:
                break;
            case Small:
                break;
        }
    }
}

//抽象枚举类
enum AbstraEnum {
    PrimaryS("pr") {
        {
            System.out.println("PrimaryS");
        }

        @Override
        public void show() {
            System.out.println();
        }
    }, JuniorS("jun") {
        {
            System.out.println("JuniorS");
        }

        @Override
        public void show() {

        }
    };

    private AbstraEnum(String str) {

    }

    //枚举类不能使用public修饰
//    public AbstraEnum(String str){
//
//    }
    public abstract void show();
}


interface A {
    Integer getAge();
}

enum Ta implements A {
    F() {
        @Override
        public void show() {

        }

        @Override
        public Integer getAge() {
            return null;
        }
    };

    public abstract void show();


}