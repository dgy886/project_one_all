package com.newfile;
/*
    解决线程安全问题的一种方案：使用同步代码块
    格式：
        synchronized（锁对象）{
            可能会出现线程安全问题的代码（访问了共享数据的代码）
        }
    注意：
        1.通过代码块中的锁对象，可以使用任意的对象
        2.但是必须保证多个线程使用的锁对象是同一个
        3.锁对象的作用：
            把同步代码块锁住，只让一个线程在同步代码块中执行
 */
public class RunnableImpl implements Runnable{
   private int ticket=100;
   //创建一个锁对象
   Object obj=new Object();
    @Override
    public void run() {
        while (true){
            //同步代码块
            /*
                同步技术原理：
                使用一个锁对象，这个锁对象也叫做同步锁，对象锁，也叫对象监视器
                3个线程一起抢夺cpu的执行权，谁抢到谁执行run方法进行卖票
                    t0抢到了cpu的执行权，执行run方法，遇到synchronized代码块
                    这时t0就会检查synchronized代码块是否有锁对象
                    如果有，获取锁对象，进行到同步中进行执行

               t1抢到了cpu的执行权，执行run方法，遇到synchronized代码块
               检查synchronized是否有锁对象
               如果没有，t1进行阻塞状态，等待t0线程归还锁对象
             */
           synchronized (obj){
               if(ticket>0){
                   //提高安全问题出现的概率，让程序睡眠
                   try {
                       Thread.sleep(10);
                   } catch (InterruptedException e) {
                       e.printStackTrace();
                   }
                   System.out.println(Thread.currentThread().getName()+"正在出售第"+ticket+"票");
                   ticket--;
               }
           }
        }

    }
}
