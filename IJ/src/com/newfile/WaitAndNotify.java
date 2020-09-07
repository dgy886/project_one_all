package com.newfile;
/*
    等待唤醒案例：线程之间的通信
        创建一个顾客线程（消费者）：告知老板要的包子的种类，调用wait方法，放弃cpu的执行，进入到WAITING状态（无限等待）
        创建一个老板线程（生产者）：花了5秒做包子，做好包子之后，调用notify方法，唤醒

 */
public class WaitAndNotify {
    public static void main(String[] args) {
        Object obj=new Object();
        new Thread(){
            public void run(){
                synchronized (obj){
                    System.out.println("告知需要的包子的数量");
                    try {
                        obj.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //唤醒之后执行的代码
                    System.out.println("包子已经做好了，开吃！！！");
                }
            }
        }.start();

        new Thread(){
            @Override
            public void run() {
                try {
                    Thread.sleep(5000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (obj){
                    System.out.println("老板5秒钟之后做好包子");
                    obj.notify();
                }

            }
        }.start();
    }
}
