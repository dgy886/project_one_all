package com.fengkuangJava.fanxing;

import java.util.ArrayList;

public class Demofanxing01 {
    public static void main(String[] args) {
        ArrayList list=new ArrayList();
        list.add("疯狂Java讲义");
        list.add("疯狂Android讲义");
        list.add(5);
        list.forEach(str->System.out.println(((String)str).length()));
        ArrayList<String> strlist=new ArrayList<>();
    }
}
