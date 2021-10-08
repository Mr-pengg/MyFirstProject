package com.learn.code7_5;

import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 匹配邮箱
 *
 * @author pengg
 * @date 2021/9/22 16:47
 */
public class test3 {
    public static void main(String[] args) {
        String mail = "埃斯pengg@fox.cn181474537@qq.com;wueeu@edu.com";
        String reg = "\\w{3,8}@\\w*.(cn|com)";
        Pattern p = Pattern.compile(reg);
        Matcher matcher = p.matcher(mail);
        while (matcher.find()) {
            System.out.println(matcher.group());
        }

        String string = "java is popular language";
        String[] s = string.split("a");
        System.out.println(Arrays.toString(s));
    }
}
