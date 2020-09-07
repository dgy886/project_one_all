package com.company;
/*
String 类：
字符串是常量；它们的值在创建后不能更改
字符串的底层是一个被final修饰的数组，不能改变，是一个常量
进行字符串的相加，内存中就会有多个字符串，占用空间多，效率低下



StringBuilder类：
字符串缓冲区，可以提高字符串的操作效率（看成一个长度可以变化的字符串）
底层也是一个数组，但是没有被final修饰，可以改变长度
构造方法：
-public StringBuilder():构造一个空的StringBuilder容器
-public StringBuilder(String str):构造一个StringBuilder容器，并将字符串添加进去

StringBuilder在内存中始终是一个数组，占用空间少，效率高
如果超出了StringBuilder的容量，会自动扩容
 */
public class DemoStringBulider {


    public static void main(String[] args) {
        StringBuilder bu1=new StringBuilder("abc");
        System.out.println("bu1:"+bu1);
        //创建StringBuilder对象
        StringBuilder bu3=new StringBuilder();
        //使用append方法往StringBuilder中添加数据
        //append方法返回的是this，调用方法的对象bu1
        //StringBuilder bu2=bu1.append("abc");
        //System.out.println(bu1);//abc
        //System.out.println(bu2);//abc
        //System.out.println(bu1==bu2)//true,表示两个对象是同一个对象

        //使用append方法无需接收返回值
        bu1.append("abc");
        bu1.append(111);
        bu1.append("zhong");
        System.out.println(bu1);

        //链式编程：方法的返回值是一个对象，可以通过对象继续调用方法
        //例子：
        bu1.append(111).append("gogogo").append("1111");
        System.out.println(bu1);
        
    }


}
