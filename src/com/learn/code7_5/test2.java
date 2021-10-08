package com.learn.code7_5;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author pengg
 * @date 2021/9/22 15:06
 */
public class test2 {
    public static void main(String[] args) {
        String str = "字符分析13274027548，231dddaasd132713402754813asd/?>'13274027548";
        Pattern p = Pattern.compile("((13)|(23))\\d{2}");
        Matcher matcher = p.matcher(str);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }
        System.out.println("************");
        String str1 = "\\?\\[";
        String str2 = "\u0041\\\\";
        Pattern pa = Pattern.compile(str2);
        Matcher matcher1 = pa.matcher("1?[]\\A\\|A\\dd");
        matcher1.find();
        System.out.println(matcher1.group());
        matcher1.reset("A2131232A\\");
        matcher1.find();
        System.out.println(matcher1.group());


    }
}
