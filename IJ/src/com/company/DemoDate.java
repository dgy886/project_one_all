package com.company;

import java.util.Date;

public class DemoDate {
    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis());//获取当前系统的时间到1970年1月1日00：00：00经历了多少毫秒
        Date date=new Date();
        Date date1=new Date(0L);
        System.out.println(date);
        System.out.println(date1);
    }
}
