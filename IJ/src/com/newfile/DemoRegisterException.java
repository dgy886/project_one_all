package com.newfile;
/*
    要求：模拟注册操作，如果用户已经存在，则抛出异常并提示，亲，该用户已被注册

    分析：
        1.使用
 */

import java.util.Scanner;

public class DemoRegisterException {
    public static String[] usernames={"张三","李四","王五"};
    public static void main(String[] args) {
        System.out.println("请输入需要注册的姓名：");
        Scanner sc=new Scanner(System.in);
        String name=sc.next();
        checkname(name);
    }
    public static void checkname(String username){
        for (String s : usernames) {
            if (s.equals(username)){
                try {
                    throw new RegisterException("亲，该用户已被注册！！！");
                } catch (RegisterException e) {
                    e.printStackTrace();
                    return;
                }
            }
        }
        System.out.println("注册成功！！！");
    }
}
