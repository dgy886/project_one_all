package com.company;
/*
java.util.Date:表示日期和时间的类
类Date：表示确定的瞬间，精确到毫秒
毫秒：千分之一 1000毫秒=1秒
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FilterOutputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
//Object是所有类的父类
public class DemoObject {
    public static void main(String[] args) throws Exception {
//        String s1="abc";
//        String s2="aaa";
//        boolean b=s1.equals(s2);
//        System.out.println(b);
//        Scanner in=new Scanner(System.in);
//        //增加下面一行将只把回车作为分隔符
//        //in.useDelimiter("\n");
//        while (in.hasNext()){
//            System.out.println(in.next());
//        }
//        throw Exception {
//            var sc = new Scanner(new File("ScannerFileTest.java"));
//            System.out.println("ScannerFileTest.java文件内容如下：");
//            //判断是否还有下一行
//            while (sc.hasNextLine()) {
//                System.out.println(sc.nextLine());
//            }
//        }




//        //获取系统所有的环境变量
//        Map<String,String> env=System.getenv();
//        for(var name:env.keySet()){
//            System.out.println(name+"--->"+env.get(name));
//        }
//        //获取指定环境变量的值
//        System.out.println(System.getenv("JAVA_HOME"));
//        //获取所有的系统属性
//        Properties properties=System.getProperties();
//        //properties.store(new FilterOutputStream("properties.txt"),"System Properties");
//        //输出特定的系统属性
//        System.out.println(System.getProperty("os.name"));

        Student s=new Student("张三",23);
        //当我们输出s时，相当于调用s.toString()；
        System.out.println(s.toString());
        String s1="abc";
        String s2="abc";
        System.out.println(s1.equals(s2));
        Student s3=new Student("张三",4);
        Student s4=new Student("张三",4);
        System.out.println(s3.equals(s4));
        //对于equals方法重写之前比较的是对象的地址值
        //重写之后比较的是对象的属性值
     }
}
