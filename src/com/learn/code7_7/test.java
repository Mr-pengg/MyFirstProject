package com.learn.code7_7;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 时间格式
 *
 * @author pengg
 * @date 2021/9/22 18:56
 */
public class test {
    public static void main(String[] args) throws ParseException {
//        date对象格式化为指定形式
        Date date = new Date();
        SimpleDateFormat format = new SimpleDateFormat(" yyyy-M-dd  hh:mm:ss");
        String format1 = format.format(date);
        System.out.println("Now time is" + format1);
        System.out.println("***************");
//        字符串变为Date对象
        String time = "2019/10/28";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/M/dd");
        Date parse = simpleDateFormat.parse(time);
        System.out.println(parse);
        System.out.println("---------");
        String str = "ABCDEFG";
        String[] cds = str.split("CD");
        String nstr = Arrays.toString(cds);
        System.out.println(nstr);

//        正则表达式验证学号
        String reg = "S\\d{5}";
        Pattern compile = Pattern.compile(reg);
        Scanner sc = new Scanner(System.in);
        String intput;
        boolean b = true;
        while (true){
            System.out.println("请输入学号：");
            intput = sc.next();
            Matcher matcher = compile.matcher(intput);
            System.out.println(matcher.matches());
        }



    }
}
