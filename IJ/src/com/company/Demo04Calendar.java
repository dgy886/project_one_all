package com.company;

import java.util.Calendar;

/*
java.util.Calendar类：日历类
Calendar类是一个抽象类，里面提供了很多操作日历字段的方法（YEAR、MONTH、DAY_MONTH、HOUR）
Calendar无法创建对象使用，里面有一个静态方法叫getInstance（），该方法返回了Calendar类的子类对象
static Calendar getInstance（）使用默认时区和语言环境获得一个日历
 */
public class Demo04Calendar {
    public static void main(String[] args) {
        Calendar c=Calendar.getInstance();
        System.out.println(c);
    }
}
