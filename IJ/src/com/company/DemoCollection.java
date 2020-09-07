package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class DemoCollection {
     //创建集合对象
     public static void main(String[] args) {
         Collection<String> coll=new ArrayList<>();

         //boolean add(E e) 向集合中添加元素
         coll.add("hello");
         coll.add("world");
         coll.add("A");
         coll.add("B");
         System.out.println(coll);

         //boolean remove(E e)删除集合中的某个元素
         //Boolean result=coll.remove("A");
         //System.out.println(result);
         System.out.println(coll);

         //void clear()清空集合
         //coll.clear();

         //boolean contains(E e);     判断集合中是否包含某个元素
         //boolean result=coll.contains("A");

         //boolean isEmpty();    判断集合是否为空
        // System.out.println(coll.isEmpty());

         //int size（）; 获取集合的长度
         //System.out.println(coll.size());

         //Object[] toArray 将集合转换为一个数组
         Object[] arr=coll.toArray();

         //遍历数组
         for (int i = 0; i <arr.length ; i++) {
             System.out.println(arr[i]);
         }
         Collection<String> coll1=new ArrayList<>();
         coll1.add("1111");
         coll1.add("2222");
         coll1.add("3333");
         coll1.add("4444");
         //多态 接口           实现类对象
         Iterator<String> it=coll1.iterator();

     }

}
