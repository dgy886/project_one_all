package com.newfile;

/*
    匿名内部类方式实现线程的创建

    匿名内部类作用：简化代码
        把子类继承父类，重写父类的方法，创建子类对象合成一步完成
        把实现类实现类接口，重写接口中的方法，创建实现类对象合成一步完成

    格式：
        new 父类/接口（）{
            重写父类/接口中的方法
        }；
 */
public class DemoRunnable {
    public static void main(String[] args) {
        //3.创建一个Runnable接口的实现类对象
        /*RunnableImpl runnable=new RunnableImpl();
        //4.创建Thread类对象，构造方法中传递Runnable接口的实现类对象
        Thread t=new Thread(runnable);
        //5.调用Thread类中的start方法，开启新的线程执行run方法
        t.start();
        for (int i = 0; i < 20; i++) {
            System.out.println(Thread.currentThread().getName()+"--->"+i);
        }*/
        //线程的父类是Thread
        //new MyThread.start()
       /* new Thread(){
            //重写run方法

            @Override
            public void run() {
                for (int i = 0; i <20 ; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        }.start();
        //线程的接口Runnable
        //Runnable r =new RunnableImpl();//多态
        Runnable r=new Runnable(){
            //重写run方法，设置线程任务
            @Override
            public void run() {
                for (int i = 0; i < 20; i++) {
                    System.out.println(Thread.currentThread().getName()+"--->"+i);
                }
            }
        };
        new Thread(r).start();*/


    }
}
