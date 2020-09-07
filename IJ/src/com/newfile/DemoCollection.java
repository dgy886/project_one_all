package com.newfile;
/*
    java.utils.Collections是集合的工具类，用来对集合进行操作，部分方法如下：
    public static <T> void sort(List<T> list);将集合中元素按照默认规则排序

    注意：
        sort（List<T> list）使用前提
        被排序的集合里边存储的元素，必须实现Comparable，重写接口中的方法CompareTo定义排序的规则
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoCollection {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(22);
        list.add(3);
        list.add(44);
        list.add(11);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                //return o1-o2;//升序排序
                return o2-o1;//降序排序
            }
        });
        System.out.println(list);
        ArrayList<Person> people=new ArrayList<>();
        people.add(new Person("d",19));
        people.add(new Person("22",20));
        people.add(new Person("33",18));
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getAge()-o2.getAge();
            }
        });
        System.out.println(people);

    }
}
