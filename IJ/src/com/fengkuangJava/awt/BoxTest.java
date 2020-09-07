package com.fengkuangJava.awt;

import javax.swing.*;
import java.awt.*;

public class BoxTest {
    private Frame f=new Frame("测试窗口");
    //定义水平摆放组件的Box对象
    private Box horizontal=Box.createHorizontalBox();
    //定义垂直摆放组件的Box对象
    private Box vertical=Box.createVerticalBox();
    public void init(){
        horizontal.add(new Button("hor the first"));
        //使用间距来分隔按钮
        horizontal.add(Box.createHorizontalGlue());
        horizontal.add(new Button("hor the second"));
        //水平方向不可拉伸的间距，其宽度为10px
        horizontal.add(Box.createHorizontalStrut(10));
        horizontal.add(new Button("hor the third"));

        vertical.add(new Button("ver the first"));
        vertical.add(Box.createVerticalGlue());
        vertical.add(new Button("ver the second"));
        //垂直方向不可拉伸的间距，其高度为10px
        vertical.add(Box.createVerticalStrut(10));
        vertical.add(new Button("ver the third"));
        f.add(vertical);
        f.add(horizontal,BorderLayout.NORTH);
        f.pack();
        f.setVisible(true);
    }

    public static void main(String[] args) {
        new BoxTest().init();
    }
}
