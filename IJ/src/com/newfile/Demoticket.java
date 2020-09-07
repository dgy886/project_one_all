package com.newfile;
/*
    模拟卖票案列
    创建3个线程，同时开启，对共享的票进行出售
 */
public class Demoticket {
    public static void main(String[] args) {
        //创建Runnable接口的实现类对象
        RunnableImpl runnable=new RunnableImpl();
        //创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t0=new Thread(runnable);
        Thread t1=new Thread(runnable);
        Thread t2=new Thread(runnable);
        //调用start方法进行线程的开启
        t0.start();
        t1.start();
        t2.start();
    }
}
