package com.fengkuangJava.awt;

import java.awt.*;

public class FrameTest {


    public static void main(String[] args) {
       /* Frame f=new Frame("测试窗口");
        //设置窗口的大小，位置
        f.setBounds(30,30,250,200);
        //将窗口显示出来（Frame对象默认处于隐藏状态）
        f.setVisible(true);
        //创建一个Panel容器
        Panel p=new Panel();
        //创建一个ScrollPane容器，指定总是具有滚动条
        ScrollPane sp=new ScrollPane(ScrollPane.SCROLLBARS_ALWAYS);
        p.add(new TextField(20));
        p.add(new Button("click"));
        //将Panel容器放入Frame中
        f.add(p);*/

      /* Frame f1=new Frame("测试窗口");
       //设置Frame容器使用FlowLayout布局管理器
        f1.setLayout(new FlowLayout(FlowLayout.LEFT,100,5));
        //向容器中添加10个按钮
        for (int i = 0; i <20 ; i++) {
            f1.add(new Button("button"+i));
        }
        //设置窗口为最佳大小
        f1.pack();
        f1.setVisible(true);*/
        /*Frame f2=new Frame("测试窗口");
        //设置Frame容器使用BorderLayout布局管理器
        f2.setLayout(new BorderLayout(30,5));
        f2.add(new Button("nan"));
        f2.pack();
        f2.setVisible(true);*/
        Frame f3=new Frame("计算器");
        Panel p1=new Panel();

    }
}
