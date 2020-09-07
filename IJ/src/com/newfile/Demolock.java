package com.newfile;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/*
    Lock接口实现类比使用synchronized方法和语句可获得的更广泛的锁定操作
    Lock接口中的方法：
        void lock（）获取锁
        void unlock（）释放锁
   使用步骤：
        1.在成员位置创建一个ReentranLock对象
        2.在可能出现安全问题的代码前调用Lock接口中的方法Lock获取锁
        3.在可能出现安全问题的代码后调用unLock释放锁
 */
public class Demolock implements Runnable{
    private int ticket=100;
    //1.在成员位置创建一个ReentrantLock对象
    Lock l=new ReentrantLock();
    @Override
    public void run() {
        while (true){
            l.lock();
                if(ticket>0){
                    //提高安全问题出现的概率，让程序睡眠
                    try {
                        Thread.sleep(10);
                        System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"票");
                        ticket--;
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }finally {
                        l.unlock();
                    }

                }

        }

    }
}


