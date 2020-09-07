package com.newfile;

import com.company.Student;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class test {
    public static void main(String[] args) {
        Student student=new Student();
        ThreadLocalRandom rand=ThreadLocalRandom.current();
        //生成一个4~20之间的伪随机整数
        int val1=rand.nextInt(4,20);
        System.out.println(val1);
        //对于双精度的数值进行运算
        var f1=new BigDecimal("1");
        Calendar c=Calendar.getInstance();
        System.out.println(c.getTime());
        //利用泛型进行操作
        var srcColl= List.of("java","kotlin","swift");
        String[] sa=srcColl.toArray(String[]::new);
        System.out.println(Arrays.toString(sa));
    }
}
