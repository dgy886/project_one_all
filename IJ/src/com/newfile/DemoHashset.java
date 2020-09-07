package com.newfile;

import java.util.HashSet;
import java.util.Iterator;

/*
哈希表：数组+链表/红黑树
 */

/*
可变参数的注意事项：
    1.一个方法的参数列表，只能有一个可变参数
    2.如果方法的可变参数有多个，那么可变参数必须写在参数列表的末尾
 */

public class DemoHashset {
    public static void method(int...arr){
        int sum=0;
        for (int i : arr) {
            sum+=i;
        }
    }
    public static void main(String[] args) {
        HashSet<Person> set=new HashSet<>();
        Person p1=new Person("xiaoming",18);
        Person p2=new Person("xiaoming",18);
        Person p3=new Person("xiaohong",19);
        set.add(p1);
        set.add(p2);
        set.add(p3);
        Iterator<Person> it=set.iterator();
        while (it.hasNext()){
            Person person=it.next();
            System.out.println(person);
        }
    }
}
