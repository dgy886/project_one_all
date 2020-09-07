package com.company;

import java.util.Calendar;
import java.util.Date;

/*
public void set(int field,int value):将给定的日历字段设置为给定值
参数：
int field:传递指定的日历字段
int value：传递的字段设置的具体的值
 */
public class Demo02Calendar {
    public static void main(String[] args) {
        demo1();
        demo2();
        demo3();
    }
    private static void demo1(){
        Calendar c=Calendar.getInstance();
        int year=c.get(Calendar.YEAR);
        System.out.println(year);
    }
    private static void demo2(){
        //public abstract void add(int field,int amount):根据日历的规则，为给定的日历添加或减去指定的时间量
        //把指定的字段增加/减少指定的值
        //使用getInstance方法获取Calendar对象
        Calendar c=Calendar.getInstance();
        c.add(Calendar.YEAR,100);
        int year=c.get(Calendar.YEAR);
        System.out.println(year);
    }
    private static void demo3(){
        Calendar c=Calendar.getInstance();
        Date date=c.getTime();
        System.out.println(date);
    }
}
