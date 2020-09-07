package com.fengkuangJava.awt;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest {
    private Frame f=new Frame("测试");
    private TextArea ta=new TextArea(6,40);
    public void init(){
        //为窗口添加窗口事件监听器
        f.addWindowListener(new MyListener());
        f.add(ta);
        f.pack();
        f.setVisible(true);
    }
    class MyListener implements WindowListener{

        @Override
        public void windowOpened(WindowEvent e) {
            ta.append("窗体被打开！\n");
        }

        @Override
        public void windowClosing(WindowEvent e) {
            ta.append("用户关闭窗体！\n");
            System.exit(0);
        }

        @Override
        public void windowClosed(WindowEvent e) {
            ta.append("窗体被成功关闭！\n");
        }

        @Override
        public void windowIconified(WindowEvent e) {
            ta.append("窗体被最小化！\n");
        }

        @Override
        public void windowDeiconified(WindowEvent e) {
            ta.append("窗体被恢复！\n");
        }

        @Override
        public void windowActivated(WindowEvent e) {
            ta.append("窗体被激活！\n");
        }

        @Override
        public void windowDeactivated(WindowEvent e) {
            ta.append("窗体失去焦点！\n");
        }
    }

    public static void main(String[] args) {
        new WindowListenerTest().init();
    }
}
