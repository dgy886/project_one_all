package com.newfile;
/*
java.util.List接口 extends Colection接口
List接口的特点：
    1.有序的序列，存储和取出元素的顺序是一致的（存123，取123）
    2.有索引，包含了一些带索引的方法
    3.允许存储重复的元素
 */

import java.util.LinkedList;

/*
java.util.LinkedList集合 implements List接口
特点：
    1.底层是一个链表结构：查询慢，增删快
    2.里面包含了大量操作首尾元素的方法
    注意：使用LinkedList集合特有的方法，不能使用多态
 */
public class DemoList {
    public static void main(String[] args) {
        LinkedList<String> linked=new LinkedList<>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
    }
}
