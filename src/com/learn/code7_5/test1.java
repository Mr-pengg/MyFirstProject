package com.learn.code7_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengg
 * @date 2021/9/22 10:49
 */
public class test1 {
    public static void main(String[] args) {
        System.out.println("\u0041\\\\");
        String str = "hello,world!";
//        System.out.println(str.matches("^5"));
        String s = str.replaceFirst("\\w*", "你好");
        System.out.println(s);
        System.out.println(str.replaceFirst("\\w*?", "你好"));
        System.out.println("***********");
        Pattern p = Pattern.compile("a*b$");
        Matcher matcher = p.matcher("aaaaaaaab");
        System.out.println(matcher.matches());
        System.out.println("---------------------");
        System.out.println(Pattern.matches("^s\\w+", "sfsdfaaaa"));
        System.out.println(Pattern.matches("\\w+c$", "sfsdfaaaa"));
        System.out.println(Pattern.matches("a$", "aaaa"));
        System.out.println("*************");
        Pattern compile = Pattern.compile("(like)$");
        String str1 = "i like anmile what do you like";
        Matcher m = compile.matcher(str1);
        m.find();
        System.out.println(m.start()+" "+(m.end()-1));
        System.out.println(m.group());
    }
}
