package com.newfile;

import java.util.ArrayList;
import java.util.Iterator;

/*
泛型的通配符：
？：代表任意的数据类型
使用方法：
    不能创建对象使用
    只能作为方法的参数使用
 */

/*
泛型的上限限定：？ extends E 代表使用的泛型只能是E类型的子类/本身
泛型的下限限定：？ super E  代表使用的泛型只能是E类型的父类/本身
 */
public class Demo02 {
    public static void main(String[] args) {
        ArrayList<Integer> list01=new ArrayList<>();
        list01.add(11);
        list01.add(22);
        ArrayList<String> list02=new ArrayList<>();
        list02.add("a");
        list02.add("b");
        printArray(list02);
        printArray(list01);
    }
    /*
    定义一个方法，能遍历所有类型的ArrayList集合
    这时候我们不知道ArrayList集合使用什么数据类型，可以泛型的通配符？来接收数据类型
    注意：
    泛型没有继承的概念
     */
    public static void printArray(ArrayList<?> list){
        //使用迭代器遍历集合
        Iterator it=list.iterator();
        while(it.hasNext()){
            //it.next()方法，取出的元素是Object，可以接收任意的数据类型
            Object o = it.next();
            System.out.println(o);
        }
    }
}
