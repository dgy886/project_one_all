package com.company;

import java.text.SimpleDateFormat;
import java.util.Date;

/*
java.text.DateFormat:是日期/时间格式化子类的抽象类
作用：
    格式化（也就是日期->文本）、解析（文本—>日期）
    成员方法：
        String format(Date date)按照指定的模式，把Date日期，格式化委符合模式的字符串
        Date parse（String source）把符合模式的字符串，解析为Date日期
     DateFormat类是一个抽象类，无法直接创建对象使用，可以使用DateFormat的子类

     java.text.SimpleDateFormat extends DateFormat
 */
public class DemoDateFormat {
    public static void main(String[] args) throws Exception {
       // demo01();
        demo02();
    }
    /*
    使用DateFormat类中的方法format，把日期格式化为文本
    String format（Date date）按照指定的模式，把Date日期，格式化为符合模式的字符串
    使用步骤：
        1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        2.调用SimpleDateFormat对象中的方法format方法，按照构造方法中指定的模式，把Date日期格式化为符合模式的字符串（文本）
     */
    private static void demo01(){
        //1.创建SimpleDateFormat对象，构造方法中传递指定的模式
        //SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        //2.调用SimpleDateFormat对象中的方法format，按照构造方法中的指定模式，把Date日期格式化为符合模式的字符串（文本）
        Date date=new Date();
        String text=sdf.format(date);
        System.out.println(date);
        System.out.println(text);
    }
    private static void demo02() throws Exception{
        /*
        public Date parse(String source )throw ParseException
        parse方法声明了一个异常叫ParseException解析异常
        如果字符串和构造方法中的模式不一样，那么程序就会抛出此异常
        调用一个抛出了异常的方法，就必须处理这个异常，要么throw继续声明抛出的这个异常，要么try。。。。catch自己处理这个异常
         */
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date=simpleDateFormat.parse("2020年07月07日 13时24分06秒");
        System.out.println(date);
    }
}
