package com.newfile;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
/*
    哈希值：是一个十进制的整数，由系统随机给出（就是对象的地址值，是一个逻辑地址，是模拟模拟出来得到地址，不是数据实际存储的物理地址）
    在Object类有一个方法，可以获取对象的哈希值
    int hasCode（）返回该对象的哈希码值
 */
public class DemoSet {
    public static void main(String[] args) {
        Set<Integer> set=new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        Iterator it=set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("---------------");
        //使用增强for
        for (Integer i : set) {
            System.out.println(i);
        }
    }
}
