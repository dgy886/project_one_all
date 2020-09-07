package com.fengkuangJava.awt;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class SimpleEventHandler extends WindowAdapter {
    private Frame f=new Frame("测试");
    private TextArea ta=new TextArea(6,40);
    public void init(){
        //将该类的默认对象作为事件监听器对象
        f.addWindowListener(this);
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }
    //GUI界面类直接包含事件处理方法
    public void windowClosing(WindowEvent e){
        System.out.println("用户关闭窗口！\n");
        System.exit(0);
    }

    public static void main(String[] args) {
        new SimpleEventHandler().init();
    }
}
