package com.newfile;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo01Generic {
    public static void main(String[] args) {
        /*
        创建集合对象，使用泛型
        好处：
            1.避免了类型转换的麻烦，存储的是什么类型，取出的就是什么类型·
            2.把运行期异常（代码运行之后会抛出的异常），提升到了编译期（写代码的时候会报错）
         */
        ArrayList<String> list=new ArrayList();
        list.add("abc");
        list.add("errt");
        //使用迭代器遍历list集合
        Iterator<String> it=list.iterator();
        while (it.hasNext()){
            String s=it.next();
            System.out.println(s);
            System.out.println(s+"->"+s.length());
        }
    }
}
