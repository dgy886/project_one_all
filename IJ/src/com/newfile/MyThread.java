package com.newfile;

public class MyThread extends Thread{
    @Override
    public void run() {
        /*for (int i = 0; i <20 ; i++) {
            System.out.println("run:"+i);

        }*/
        String name=getName();
        System.out.println(name);
    }
}
