package com.learn.code8_2;

import java.io.IOException;
import java.io.InputStream;
import java.util.Scanner;

/**
 * @author pengg
 * @date 2021/9/23 18:42
 */
public class Test1 {
    public static void main(String[] args) {
        byte[] buffer = new byte[100];
        new Scanner(System.in);
        System.out.println("请输入：");
        try {
//            键盘输入读入buffer数组
            int len = System.in.read(buffer);
            String str = new String(buffer,0,len);

//            String str = buffer;
            System.out.println("hello"+str+"haha");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void MyScanner(InputStream in){

    }
}
