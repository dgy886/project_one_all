package com.company;

import org.w3c.dom.ls.LSOutput;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/*
练习：请使用日期时间相关的API，计算一个人已经出生了多少天
 */
public class Demo03DateFormat {
    public static void main(String[] args) throws ParseException {

        Scanner in=new Scanner(System.in);
        System.out.print("请输入你的出生日期：格式为：yyyy-MM-dd");
        String birth=in.next();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        Date date1=sdf.parse(birth);
        long date2=date1.getTime();
        long newdate=new Date().getTime();
        long date=(newdate-date2)/1000/60/60/24;
        System.out.println("你已经出生了"+date);

    }

}
